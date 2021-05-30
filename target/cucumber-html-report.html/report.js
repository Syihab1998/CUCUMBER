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
      "name": "@Admin"
    }
  ]
});
formatter.before({
  "duration": 3241262268,
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
  "name": "User 1 on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User 1 click Admin button and click add button to go to add user page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User select Admin as role \u0026 input \"kim jong un\" as employeeUserName \u0026 input \"syihabcuy\" as userName \u0026 input \"s3Kol4HQA!*\" as userPassword \u0026 input \"s3Kol4HQA!*\" as userRePass \u0026 click save button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User succesfully add new user data",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 45
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 67
    }
  ],
  "location": "AdminStep.VisitLoginPage2(String,String)"
});
formatter.result({
  "duration": 4453373071,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.goToAdminPageToAddUser()"
});
formatter.result({
  "duration": 8673426085,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kim jong un",
      "offset": 35
    },
    {
      "val": "syihabcuy",
      "offset": 77
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 109
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 147
    }
  ],
  "location": "AdminStep.inputCredentialToAddUser(String,String,String,String)"
});
formatter.result({
  "duration": 15481031455,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.userSuccessfullAddNewUser()"
});
formatter.result({
  "duration": 5029915757,
  "status": "passed"
});
formatter.after({
  "duration": 111301371,
  "status": "passed"
});
formatter.before({
  "duration": 2087968406,
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
  "name": "User 2 on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User 2 click Admin button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User input \"syihab\" as userName \u0026 click search button",
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
      "offset": 45
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 67
    }
  ],
  "location": "AdminStep.VisitLoginPage3(String,String)"
});
formatter.result({
  "duration": 4274178553,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.goToAdminPageSearchToUser()"
});
formatter.result({
  "duration": 5402695258,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "syihab",
      "offset": 12
    }
  ],
  "location": "AdminStep.inputCredentialToSearchUser(String)"
});
formatter.result({
  "duration": 5368748584,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.GetUser()"
});
formatter.result({
  "duration": 28942689,
  "status": "passed"
});
formatter.after({
  "duration": 105086785,
  "status": "passed"
});
formatter.before({
  "duration": 2021533655,
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
  "name": "User 3 on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Users 3 click Admin button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User input \"cihui\" as xUserNamee \u0026 click search button",
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
      "offset": 45
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 67
    }
  ],
  "location": "AdminStep.VisitLoginPage4(String,String)"
});
formatter.result({
  "duration": 4216202503,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.goToAdminPageSearchToXUser()"
});
formatter.result({
  "duration": 5401135233,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cihui",
      "offset": 12
    }
  ],
  "location": "AdminStep.inputCredentialToSearchXUser(String)"
});
formatter.result({
  "duration": 5374753075,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.xGetUser()"
});
formatter.result({
  "duration": 24919474,
  "status": "passed"
});
formatter.after({
  "duration": 142204830,
  "status": "passed"
});
formatter.before({
  "duration": 1870276234,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User register OAuth client",
  "description": "",
  "id": "search-add-and-delete-data-on-admin-page;user-register-oauth-client",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@regOAuthClient"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User 4 on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "User 4 click Admin button \u0026 click configuration button \u0026 click register OAuth client button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User input \"syihabbb\" as oAuthId \u0026 input \"syihab12\" as oAuthSecret \u0026 input \"[ https://orangehrm.github.io/orangehrm-api-doc ].\" as oAuthUrl \u0026 click button save",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User successfully register OAuth client",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 45
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 67
    }
  ],
  "location": "AdminStep.VisitLoginPage5(String,String)"
});
formatter.result({
  "duration": 4266765184,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.userGoToRegOAuthClient()"
});
formatter.result({
  "duration": 8801517338,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "syihabbb",
      "offset": 12
    },
    {
      "val": "syihab12",
      "offset": 42
    },
    {
      "val": "[ https://orangehrm.github.io/orangehrm-api-doc ].",
      "offset": 76
    }
  ],
  "location": "AdminStep.inputCredentialToRegOAuthClient(String,String,String)"
});
formatter.result({
  "duration": 5390253516,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.successfullyRegisterOAuthClient()"
});
formatter.result({
  "duration": 26892953,
  "status": "passed"
});
formatter.after({
  "duration": 103358141,
  "status": "passed"
});
formatter.before({
  "duration": 1801302367,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "User delete OAuth client data",
  "description": "",
  "id": "search-add-and-delete-data-on-admin-page;user-delete-oauth-client-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@deleteOAuthClient"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User 5 on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User 5 click Admin button \u0026 click configuration button \u0026 click register OAuth client button",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User click one of data to be delete \u0026 click ok button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User successfully delete OAuth client data",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 45
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 67
    }
  ],
  "location": "AdminStep.VisitLoginPage6(String,String)"
});
formatter.result({
  "duration": 3934408021,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.goToConfigAdminPageToDeleteOAuthClient()"
});
formatter.result({
  "duration": 15755432461,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.selectOAuthClientToBeDelete()"
});
formatter.result({
  "duration": 10426236726,
  "status": "passed"
});
formatter.match({
  "location": "AdminStep.successfullyDeleteOAuthClient()"
});
formatter.result({
  "duration": 25625682,
  "status": "passed"
});
formatter.after({
  "duration": 105422302,
  "status": "passed"
});
});