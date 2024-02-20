import { registerPlugin } from '@capacitor/core';

import type { ZohoDeskPortalSDKPlugin, ZDPortalChat, ZDPortalCommunity, ZDPortalHome, ZDPortalKB, ZDPortalLiveChat } from './definitions';

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
);

const ZohoDeskPortalKB = registerPlugin<ZDPortalKB>(
  'ZDPortalKB'
);

const ZohoDeskPortalLiveChat = registerPlugin<ZDPortalLiveChat>(
  'ZDPortalLiveChat'
)
export * from './definitions';
export { ZohodeskPortalSDK, ZohoDeskPortalChat, ZohoDeskPortalCommunity, ZohoDeskPortalHome, ZohoDeskPortalKB, ZohoDeskPortalLiveChat };
