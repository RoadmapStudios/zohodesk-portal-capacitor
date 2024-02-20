import { registerPlugin } from '@capacitor/core';

import type { ZohoDeskPortalSDKPlugin, ZDPortalChat, ZDPortalCommunity, ZDPortalHome } from './definitions';

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
);

const ZohoDeskPortalHome = registerPlugin<ZDPortalHome>(
  'ZDPortalHome'
)
export * from './definitions';
export { ZohodeskPortalSDK, ZohoDeskPortalChat, ZohoDeskPortalCommunity, ZohoDeskPortalHome };
