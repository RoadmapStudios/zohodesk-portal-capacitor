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
  async initializeZohoDeskPortalDashboard( ): Promise<void> {
    // ZDPortalHome.initialize(MainActivity.this, "https://desk.zoho.com");
    // ZDPortalHome.show(MainActivity.this);
    return;
  }

}
