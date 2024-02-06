import { WebPlugin } from '@capacitor/core';

import type { ZohoDeskPortalSDKPlugin } from './definitions';

export class ZohoDeskPortalSDKWeb
  extends WebPlugin
  implements ZohoDeskPortalSDKPlugin
{
  async init(options: { orgId: string, appId: string, dc: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    // RNZohoDeskPortalSDK.initialise(orgId, appId, dc);
    return { value: 'initialise' };
  }
  
  // Initialize Zoho Desk portal dashboard
  // async init(options: { orgId: string, appId: string, phone: string }): Promise<{ value: string }> {

  //     RNZDPortalChat.setGuestUserDetails(email, name, phone);
  //   return { value: 'setGuestUserDetails' };
  // }
  

}
