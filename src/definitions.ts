export interface ZohoDeskPortalSDKPlugin {
  initialise(options: { orgId: string, appId: string, dc: string }): Promise<{ value: string }>;
  setUserToken(options: { userToken: string }): Promise<void>;
  setJWTToken(options: { jwtToken: string }): Promise<void>;
  isUserSignedIn(): Promise<{ signedIn: boolean }>;
  logout(): Promise<{ message: string }>;
  setFirebaseId(options: { firebaseId: string }): Promise<void>;
  enablePush(): Promise<void>;
  disablePush(): Promise<void>;
}