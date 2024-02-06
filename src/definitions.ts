export interface ZohoDeskPortalSDKPlugin {
  init(options: { orgId: string, appId: string, dc: string }): Promise<{ value: string }>;
}
