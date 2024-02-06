export interface ZohoDeskPortalSDKPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  // setGuestUserDetails(email: any, name: any, phone: any): Promise<{ value: string }>;
}
