import { registerPlugin } from '@capacitor/core';

import type { ZohoDeskPortalSDKPlugin } from './definitions';

const ZohoDeskPortalSDK = registerPlugin<ZohoDeskPortalSDKPlugin>(
  'ZohoDeskPortalSDK',
  {
    web: () => import('./web').then(m => new m.ZohoDeskPortalSDKWeb()),
  },
);

export * from './definitions';
export { ZohoDeskPortalSDK };
