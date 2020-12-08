$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("_01_Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Senaryo ;"
    },
    {
      "line": 2,
      "value": "#1- siteyi açınız."
    },
    {
      "line": 3,
      "value": "#2- username ve password u gönderin ve Login butonuna tıklatın."
    },
    {
      "line": 4,
      "value": "#3- Login olduğunuzu doğrulayın."
    }
  ],
  "line": 6,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 237600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 8,
      "value": "#username ve password girerek login doğrulama"
    }
  ],
  "line": 10,
  "name": "Login with valid username and password",
  "description": "",
  "id": "login-functionality;login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@SmokeTest"
    },
    {
      "line": 9,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#siteyi aç - basgara a git"
    }
  ],
  "line": 13,
  "name": "Navigate to basqar",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#username ve passwordu gir ve login butonuna tıklat"
    }
  ],
  "line": 15,
  "name": "Enter username and password and click Login button",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#Login olduğunu doğrula"
    }
  ],
  "line": 17,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "_01_LoginSteps.navigate_to_basqar()"
});
formatter.result({
  "duration": 8586067600,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.enter_username_and_password_and_click_Login_button()"
});
formatter.result({
  "duration": 969669100,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.user_should_login_successfully()"
});
formatter.result({
  "duration": 21300,
  "status": "passed"
});
formatter.after({
  "duration": 5734114600,
  "status": "passed"
});
formatter.uri("_09_EnteranceExam.feature");
formatter.feature({
  "line": 1,
  "name": "Entrance Exam functionality",
  "description": "",
  "id": "entrance-exam-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 131400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Navigate to basqar",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter username and password and click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "_01_LoginSteps.navigate_to_basqar()"
});
formatter.result({
  "duration": 8267854200,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.enter_username_and_password_and_click_Login_button()"
});
formatter.result({
  "duration": 851189800,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.user_should_login_successfully()"
});
formatter.result({
  "duration": 13900,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Create entrance exam",
  "description": "",
  "id": "entrance-exam-functionality;create-entrance-exam",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Click on the element in the left class",
  "rows": [
    {
      "cells": [
        "entranceExamsParent"
      ],
      "line": 12
    },
    {
      "cells": [
        "entranceExamsSetup"
      ],
      "line": 13
    },
    {
      "cells": [
        "entranceExamsChild"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Click on the element in the content class",
  "rows": [
    {
      "cells": [
        "addButton"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User sending the keys in the form content class",
  "rows": [
    {
      "cells": [
        "nameInput",
        "ExamOneIsmet3"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Click in the new exam form",
  "rows": [
    {
      "cells": [
        "academicPeriod"
      ],
      "line": 23
    },
    {
      "cells": [
        "option1"
      ],
      "line": 24
    },
    {
      "cells": [
        "gradeLevel"
      ],
      "line": 25
    },
    {
      "cells": [
        "option1"
      ],
      "line": 26
    },
    {
      "cells": [
        "documentType"
      ],
      "line": 27
    },
    {
      "cells": [
        "option1"
      ],
      "line": 28
    },
    {
      "cells": [
        "examsAddBtn"
      ],
      "line": 29
    },
    {
      "cells": [
        "saveButton"
      ],
      "line": 30
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Success message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Click on the element in the left class",
  "rows": [
    {
      "cells": [
        "entranceExamsParent"
      ],
      "line": 35
    },
    {
      "cells": [
        "entranceExamsSetup"
      ],
      "line": 36
    },
    {
      "cells": [
        "entranceExamsChild"
      ],
      "line": 37
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User delete the \"ExamOneIsmet3\"",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Success message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "_08_DataTableSteps.clickOnTheElementInTheLeftClass(DataTable)"
});
formatter.result({
  "duration": 4355443700,
  "status": "passed"
});
formatter.match({
  "location": "_08_DataTableSteps.clickOnTheElementInTheContentClass(DataTable)"
});
formatter.result({
  "duration": 1005660300,
  "status": "passed"
});
formatter.match({
  "location": "_09_EntranceExamSteps.userSendingTheKeysInTheFormContentClass(DataTable)"
});
formatter.result({
  "duration": 832339000,
  "status": "passed"
});
formatter.match({
  "location": "_09_EntranceExamSteps.clickInTheNewExamForm(DataTable)"
});
formatter.result({
  "duration": 1791909200,
  "status": "passed"
});
formatter.match({
  "location": "_02_CountrySteps.success_message_should_be_displayed()"
});
formatter.result({
  "duration": 946246200,
  "status": "passed"
});
formatter.match({
  "location": "_08_DataTableSteps.clickOnTheElementInTheLeftClass(DataTable)"
});
formatter.result({
  "duration": 1762457000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ExamOneIsmet3",
      "offset": 17
    }
  ],
  "location": "_03_CountryCreateEditDeleteSteps.user_delete_the(String)"
});
formatter.result({
  "duration": 2536622600,
  "status": "passed"
});
formatter.match({
  "location": "_02_CountrySteps.success_message_should_be_displayed()"
});
formatter.result({
  "duration": 706386800,
  "status": "passed"
});
formatter.after({
  "duration": 5749617800,
  "status": "passed"
});
});