import { WebPlugin } from '@capacitor/core';

import type { ZohoDeskPortalSDKPlugin } from './definitions';


export class ZohoDeskPortalSDKWeb
  extends WebPlugin
  implements ZohoDeskPortalSDKPlugin {

  async initialise(options: { orgId: string; appId: string; dc: string; }): Promise<{ value: string }> {
    console.log('intializing with options', options);
    return { value: 'initialisation done' }
  }

  async setUserToken(options: { userToken: string; }): Promise<void> {
    console.log('set User token', options);
  }

  async setJWTToken(options: { jwtToken: string; }): Promise<void> {
    console.log('set jwt token', options);
  }

  async isUserSignedIn(): Promise<{ signedIn: boolean }> {
    console.log("signin", true);
    return { signedIn: true }
  }

  async logout(): Promise<{ message: string; }> {
    console.log("logging out", false);
    return { message: 'logged out' }
  }

  async enablePush(): Promise<void> {
    console.log("enabling push");
  }

  async disablePush(): Promise<void> {
    console.log("disabling push");
  }
}



