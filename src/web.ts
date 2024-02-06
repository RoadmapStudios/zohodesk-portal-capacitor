import { WebPlugin } from '@capacitor/core';

import type { ZohoDeskPortalSDKPlugin } from './definitions';

export class ZohoDeskPortalSDKWeb
  extends WebPlugin
  implements ZohoDeskPortalSDKPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
  
  // Initialize Zoho Desk portal dashboard
  // async setGuestUserDetails(email: any, name: any, phone: any) {

  //     RNZDPortalChat.setGuestUserDetails(email, name, phone);
  //   return { value: 'setGuestUserDetails' };
  // }
  

}
