import { registerPlugin } from '@capacitor/core';

import type { ZohoDeskPortalSDKPlugin, ZDPortalChat, ZDPortalCommunity } from './definitions';

const ZohodeskPortalSDK = registerPlugin<ZohoDeskPortalSDKPlugin>(
  'ZohodeskPortalSDK',
  {
    web: () => import('./web').then(m => new m.ZohoDeskPortalSDKWeb()),
  },
);

const ZohoDeskPortalChat = registerPlugin<ZDPortalChat>(
  'ZDPortalChat'
);

const ZohoDeskPortalCommunity = registerPlugin<ZDPortalCommunity>(
  'ZDPortalCommunity'
)
export * from './definitions';
export { ZohodeskPortalSDK, ZohoDeskPortalChat, ZohoDeskPortalCommunity };
