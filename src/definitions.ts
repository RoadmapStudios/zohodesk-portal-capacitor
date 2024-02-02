export interface ZohoDeskPortalSDKPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
