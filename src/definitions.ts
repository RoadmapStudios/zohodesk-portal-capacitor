export interface ZohoDeskPortalSDKPlugin {
  initialise(options: { orgId: string, appId: string, dc: string }): Promise<{ value: string }>;
}
