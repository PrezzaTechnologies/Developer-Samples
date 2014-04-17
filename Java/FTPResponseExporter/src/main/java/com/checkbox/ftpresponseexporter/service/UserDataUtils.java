package com.checkbox.ftpresponseexporter.service;

import com.checkbox.ftpresponseexporter.responsedata.ArrayOfSimpleNameValue;
import com.checkbox.ftpresponseexporter.responsedata.ArrayOfUserData;
import com.checkbox.ftpresponseexporter.responsedata.SimpleNameValue;
import com.checkbox.ftpresponseexporter.responsedata.UserData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class UserDataUtils {

    private UserDataUtils() {
    }

    public static List<String> getUserDataFieldsAsStringList(ArrayOfUserData respondentsData) {
        if (respondentsData != null) {

            UserData userData = respondentsData.getUserData().get(0);
            ArrayOfSimpleNameValue profileNameValueArray = userData.getProfile().getValue().getNameValueList().getValue();
            List<SimpleNameValue> simpleNameValue = profileNameValueArray.getSimpleNameValue();

            List<String> userDataFields = new ArrayList<>();
            userDataFields.add("AuthenticationType");
            userDataFields.add("Email");
            userDataFields.add("IsInList");
            userDataFields.add("LockedOut");

            for (SimpleNameValue nameValue : simpleNameValue) {
                userDataFields.add(nameValue.getName().getValue());
            }

            userDataFields.add("UserGuid");

            return userDataFields;
        } else {
            return Collections.emptyList();
        }
    }

    public static List<String> getDetailUserInfoByUserIdentifier(ArrayOfUserData respondentsData, String userIdentifier) {
        assert userIdentifier != null;

        if (respondentsData != null) {
            List<UserData> userData = respondentsData.getUserData();
            for (UserData data : userData) {
                if (data.getUniqueIdentifier().getValue().equals(userIdentifier)) {
                    return getUserDataAsStringList(data);
                }
            }
        }
        return Collections.emptyList();
    }

    private static List<String> getUserDataAsStringList(UserData userData) {
        assert userData != null;

        ArrayOfSimpleNameValue profileNameValueArray = userData.getProfile().getValue().getNameValueList().getValue();
        List<SimpleNameValue> simpleNameValue = profileNameValueArray.getSimpleNameValue();

        List<String> stringUserData = new ArrayList<>();
        stringUserData.add(userData.getAuthenticationType().getValue());
        stringUserData.add(userData.getEmail().getValue());
        stringUserData.add(userData.isIsInList().toString());
        stringUserData.add(userData.isLockedOut().toString());

        for (SimpleNameValue nameValue : simpleNameValue) {
            stringUserData.add(nameValue.getValue().getValue());
        }

        stringUserData.add(userData.getUserGuid());
        return stringUserData;
    }

}
