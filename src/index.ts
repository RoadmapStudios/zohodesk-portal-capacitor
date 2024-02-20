import { registerPlugin } from '@capacitor/core';

import type { ZohoDeskPortalSDKPlugin, ZDPortalChat } from './definitions';

const ZohodeskPortalSDK = registerPlugin<ZohoDeskPortalSDKPlugin>(
  'ZohodeskPortalSDK',
  {
    web: () => import('./web').then(m => new m.ZohoDeskPortalSDKWeb()),
  },
);

const ZohoDeskPortalChat = registerPlugin<ZDPortalChat>(
  'ZDPortalChat'
)
export * from './definitions';
export { ZohodeskPortalSDK, ZohoDeskPortalChat };
