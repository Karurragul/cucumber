$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/2dMap.feature");
formatter.feature({
  "name": "Tariff",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to add tariff plan",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "the user is in add tariff plan",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.the_user_is_in_add_tariff_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills the valid details",
  "rows": [
    {
      "cells": [
        "rental1",
        "freelocalmin",
        "freeinternationalmin",
        "freesmspack",
        "localperminutescharge",
        "Internationalperminutes",
        "SMSpercharges"
      ]
    },
    {
      "cells": [
        "111",
        "100",
        "222",
        "333",
        "444",
        "555",
        "666"
      ]
    },
    {
      "cells": [
        "222",
        "211",
        "233",
        "244",
        "255",
        "266",
        "277"
      ]
    },
    {
      "cells": [
        "333",
        "310",
        "312",
        "323",
        "333",
        "344",
        "355"
      ]
    },
    {
      "cells": [
        "433",
        "410",
        "412",
        "423",
        "433",
        "444",
        "455"
      ]
    },
    {
      "cells": [
        "533",
        "510",
        "512",
        "523",
        "533",
        "544",
        "555"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "steps.the_user_fills_valid_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click submit button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.the_user_click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the outcome",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.i_validate_the_outcome()"
});
formatter.result({
  "status": "passed"
});
});