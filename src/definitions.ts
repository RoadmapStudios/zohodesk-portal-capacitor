export interface ZohoDeskPortalSDKPlugin {
  initialise(options: { orgId: string, appId: string, dc: string }): Promise<{ value: string }>;
  setUserToken(options: { userToken: string }): Promise<void>;
  setJWTToken(options: { jwtToken: string }): Promise<void>;
  isUserSignedIn(): Promise<{ signedIn: boolean }>;
  logout(): Promise<{ message: string }>;
  setFirebaseId(options: { firebaseId: string }): Promise<void>;
  enablePush(): Promise<void>;
  disablePush(): Promise<void>;
  handleNotification(options: { extras: any, icon: number }): Promise<void>;
  setThemeType(options: { type: number }): Promise<void>;
  setThemeBuilder(options: { themeColors: { [key: string]: string }, isDarkTheme: boolean }): Promise<void>;
  enableLogs(): Promise<void>;
  disableLogs(): Promise<void>;
}

export interface ZDPortalChat {
  show(): Promise<void>;
  setGuestUserDetails(options: { email: string, name: string, phone: string }): Promise<void>;
}

export interface ZDPortalCommunity {
  show(): Promise<void>;
}

export interface ZDPortalHome {
  show(): Promise<void>;
}

export interface ZDPortalKB {
  show(): Promise<void>;
}

export interface ZDPortalLiveChat {
  show(): Promise<void>;
}