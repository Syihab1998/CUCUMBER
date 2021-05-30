$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/adminPage.feature");
formatter.feature({
  "line": 2,
  "name": "Search add and delete data on Admin Page",
  "description": "",
  "id": "search-add-and-delete-data-on-admin-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AdminPage"
    }
  ]
});
formatter.before({
  "duration": 11907397100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add new user data",
  "description": "",
  "id": "search-add-and-delete-data-on-admin-page;add-new-user-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@AddData"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "1User on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "2User click Admin button and click add button to go to add user page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User select Admin as role \u0026 input \"rere rere caesaria\" as employeeUserName \u0026 input \"TinyWinieBity\" as userName \u0026 input \"s3Kol4HQA!*\" as userPassword \u0026 input \"s3Kol4HQA!*\" as userRePass \u0026 click save button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User can add new user data",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 44
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 66
    }
  ],
  "location": "PIMStep.visitLoginPagee(String,String)"
});
formatter.result({
  "duration": 7875121099,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.goToAdminPageToAddUser()"
});
formatter.result({
  "duration": 11275369001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rere rere caesaria",
      "offset": 35
    },
    {
      "val": "TinyWinieBity",
      "offset": 84
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 120
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 158
    }
  ],
  "location": "AdminStep.inputCredentialToAddUser(String,String,String,String)"
});
formatter.result({
  "duration": 23816243000,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 746187100,
  "status": "passed"
});
formatter.before({
  "duration": 4482178600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User verify user data entered exist",
  "description": "",
  "id": "search-add-and-delete-data-on-admin-page;user-verify-user-data-entered-exist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@SearchData"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "2User on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "1User click Admin button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User input \"TinyWinieBity\" as userName \u0026 click search button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User get user data on the list",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 44
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 66
    }
  ],
  "location": "AdminStep.VisitLoginPage3(String,String)"
});
formatter.result({
  "duration": 8615737300,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.goToAdminPageSearchToUser()"
});
formatter.result({
  "duration": 6716233700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TinyWinieBity",
      "offset": 12
    }
  ],
  "location": "AdminStep.inputCredentialToSearchUser(String)"
});
formatter.result({
  "duration": 7119962601,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.GetUser()"
});
formatter.result({
  "duration": 36982300,
  "status": "passed"
});
formatter.after({
  "duration": 773340300,
  "status": "passed"
});
formatter.before({
  "duration": 3263128900,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User looking for random data",
  "description": "",
  "id": "search-add-and-delete-data-on-admin-page;user-looking-for-random-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@SearchRandomData"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "3User on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Users click Admin button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User input \"rere\" as xUserNamee \u0026 click search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User get notFoundMessage on the list",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 44
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 66
    }
  ],
  "location": "AdminStep.VisitLoginPage4(String,String)"
});
formatter.result({
  "duration": 5669487500,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.goToAdminPageSearchToXUser()"
});
formatter.result({
  "duration": 5728256900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rere",
      "offset": 12
    }
  ],
  "location": "AdminStep.inputCredentialToSearchXUser(String)"
});
formatter.result({
  "duration": 5611746001,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.xGetUser()"
});
formatter.result({
  "duration": 34646800,
  "status": "passed"
});
formatter.after({
  "duration": 730064900,
  "status": "passed"
});
formatter.before({
  "duration": 9120967500,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User delete data from the list",
  "description": "",
  "id": "search-add-and-delete-data-on-admin-page;user-delete-data-from-the-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@DeleteData"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "4User on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "5User click Admin button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User click checkbox on the data that want to be delete and click delete button and click ok button on pop up",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User get the data removed from the list",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 44
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 66
    }
  ],
  "location": "AdminStep.VisitLoginPage8(String,String)"
});
formatter.result({
  "duration": 5175327301,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.goToConfigAdminPageToDeleteUser()"
});
formatter.result({
  "duration": 5724845500,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.selectOAuthUserToBeDelete()"
});
formatter.result({
  "duration": 46621600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#ohrmList_chkSelectRecord_61\"}\n  (Session info: chrome\u003d90.0.4430.212)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RERE-IDEAPAD\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.212, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\caesa\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53505}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: ac8f181bdd6b6559b7bf9ecc5ee65741\n*** Element info: {Using\u003did, value\u003dohrmList_chkSelectRecord_61}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat pageObject.allPage.unameAdminToDeleteSelected(allPage.java:396)\r\n\tat step_definitions.AdminStep.selectOAuthUserToBeDelete(AdminStep.java:169)\r\n\tat ✽.And User click checkbox on the data that want to be delete and click delete button and click ok button on pop up(features/adminPage.feature:30)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AdminStep.successfullyDeleteUser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 831861700,
  "status": "passed"
});
formatter.before({
  "duration": 2874331300,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User register OAuth client",
  "description": "",
  "id": "search-add-and-delete-data-on-admin-page;user-register-oauth-client",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@regOAuthClient"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "5User on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "4User click Admin button \u0026 click configuration button \u0026 click register OAuth client button",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User input \"rere\" as oAuthId \u0026 input \"123\" as oAuthSecret \u0026 input \"[ https://orangehrm.github.io/orangehrm-api-doc ].\" as oAuthUrl \u0026 click button save",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User successfully register OAuth client",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 44
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 66
    }
  ],
  "location": "AdminStep.VisitLoginPage5(String,String)"
});
formatter.result({
  "duration": 5583385400,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.userGoToRegOAuthClient()"
});
formatter.result({
  "duration": 9149424999,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rere",
      "offset": 12
    },
    {
      "val": "123",
      "offset": 38
    },
    {
      "val": "[ https://orangehrm.github.io/orangehrm-api-doc ].",
      "offset": 67
    }
  ],
  "location": "AdminStep.inputCredentialToRegOAuthClient(String,String,String)"
});
formatter.result({
  "duration": 5583129999,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.successfullyRegisterOAuthClient()"
});
formatter.result({
  "duration": 34229500,
  "status": "passed"
});
formatter.after({
  "duration": 741427899,
  "status": "passed"
});
formatter.before({
  "duration": 4217609300,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "User delete OAuth client data",
  "description": "",
  "id": "search-add-and-delete-data-on-admin-page;user-delete-oauth-client-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@deleteOAuthClient"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "6User on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "3User click Admin button \u0026 click configuration button \u0026 click register OAuth client button",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "User click one of data to be delete \u0026 click ok button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User successfully delete OAuth client data",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 44
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 66
    }
  ],
  "location": "AdminStep.VisitLoginPage6(String,String)"
});
formatter.result({
  "duration": 5610429600,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.goToConfigAdminPageToDeleteOAuthClient()"
});
formatter.result({
  "duration": 16120732200,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.selectOAuthClientToBeDelete()"
});
formatter.result({
  "duration": 11785007600,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.successfullyDeleteOAuthClient()"
});
formatter.result({
  "duration": 30647700,
  "status": "passed"
});
formatter.after({
  "duration": 769589901,
  "status": "passed"
});
});