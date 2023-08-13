package com.osepoo.angamizaactual;

public class URLs {

    public static final String BASE_URL ="https://siranjofu.000webhostapp.com";
    private static final String ROOT_URL = BASE_URL + "/angamiza_api.php?apicall=";
    public static final String URL_FEED = BASE_URL + "/angamiza_api2.php?page=";
    public static final String URL_LOGIN = ROOT_URL + "login";

    //TASKS URL
    public static final String URL_TASKS = BASE_URL + "/tasks_api.php?page=";

    //TASKS LEADERS URL
    public static final String URL_TASKS_LEADERS = BASE_URL + "/tasks_leader_api.php?apicall=";
    public static final String URL_TASKS_HEADERS = ROOT_URL + "tasks_header";
    public static final String URL_TASKS_TASKS = ROOT_URL + "taskss";
    public static final String URL_CARLOGTEXTS = ROOT_URL + "carlogtexts";
    public static final String URL_PERSONLOGTEXTS = ROOT_URL + "personlogtexts";

    public static final String URL_SEARCHCAR = ROOT_URL + "searchbarcar";
    public static final String URL_SEARCHPERSON = ROOT_URL + "searchbarperson";
    //JSON TAGS FEED
    public static final String TAG_PHOTO = "photo";
    public static final String TAG_DESCRIPTION = "description";
    public static final String TAG_POLICE_P = "police_precinct";

    //JSON TAGS TASKS
    public static final String TAG_SIGNINNAME = "signinname";
    public static final String TAG_EMPID = "empid";
    public static final String TAG_TASK = "task";
    public static final String TAG_PRIORITY = "priority";
    public static final String TAG_DATE = "date_created";

    //JSON TAGS TASKS_LEADERS
    public static final String TAG_LEADERNAME = "name";
    public static final String TAG_LEADERPHOTO = "precinct";
    public static final String TAG_LEADERPRECINCT = "photo";


}
