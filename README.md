# zohodesk-portal-capacitor

Enable Zoho Desk ASAP and Zoho Chat for Angular Capacitor apps

## Install

```bash
npm install zohodesk-portal-capacitor
npx cap sync
```
## Setup for Android

- 1. In android/app/src/main/AndroidManifest.xml Add the following :
Manifest Tag : xmlns:tools="http://schemas.android.com/tools"
Application Tag : tools:replace="android:allowBackup"

- 2. In gradle.properties Add the following :
android.enableJetifier=true

- 3. In android/app/build.gradle Add the following :
In repositories : maven { url 'https://maven.zohodl.com' }
                  maven { url "https://downloads.zohocdn.com/wmslibrary" }

## API

<docgen-index>

* [`initialise(...)`](#initialise)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### initialise(...)

```typescript
initialise(options: { orgId: string; appId: string; dc: string; }) => Promise<void>
```

| Param         | Type                                                       |
| ------------- | ---------------------------------------------------------- |
| **`options`** | <code>{ orgId: string; appId: string; dc: string; }</code> |

--------------------

</docgen-api>
