import { registerPlugin } from '@capacitor/core';

import type { ZohoDeskPortalSDKPlugin } from './definitions';

const RNZohodeskPortalSDK = registerPlugin<ZohoDeskPortalSDKPlugin>(
  'RNZohodeskPortalSDK',
  {
    web: () => import('./web').then(m => new m.ZohoDeskPortalSDKWeb()),
  },
);

export * from './definitions';
export { RNZohodeskPortalSDK };
