package com.apps.aldoapps.TabMenu;

import com.apps.aldoapps.Model.ModelFriend;
import com.apps.aldoapps.R;

import java.util.ArrayList;

public class FriendTabData {

    private static final int[] FriendList = {
            R.drawable.friend1,
            R.drawable.friend2,
    };

    public static ArrayList<ModelFriend> prepareData(){
        ArrayList<ModelFriend> ArrayData = new ArrayList<>();
        for (int i=0; i<FriendList.length; i++){
            ModelFriend modelFriend = new ModelFriend();
            modelFriend.setImage_friend(FriendList[i]);
            ArrayData.add(modelFriend);
        }
        return ArrayData;
    }
}
