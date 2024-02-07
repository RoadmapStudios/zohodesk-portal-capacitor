import { WebPlugin } from '@capacitor/core';

import type { ZohoDeskPortalSDKPlugin } from './definitions';

declare interface ZohoDeskPortal {
  init(orgId: string, appId: string, dc: string): Promise<{ value: string }>;
}
declare let ZDPortal: ZohoDeskPortal;
declare global {
  interface Window {
    zdAsyncInit: () => void;
  }
}

export class ZohoDeskPortalSDKWeb
  extends WebPlugin
  implements ZohoDeskPortalSDKPlugin
{
  async initialise(options: { orgId: string, appId: string, dc: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return ZDPortal.init(options.orgId, options.appId, options.dc);
  }

  
  // Initialize Zoho Desk portal dashboard
  // async init(options: { orgId: string, appId: string, phone: string }): Promise<{ value: string }> {

  //     RNZDPortalChat.setGuestUserDetails(email, name, phone);
  //   return { value: 'setGuestUserDetails' };
  // }
  

}
