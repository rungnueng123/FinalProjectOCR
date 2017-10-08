package com.ite17.pikulkaew.teamdr.ocrproject.model.dao;


import com.ite17.pikulkaew.teamdr.ocrproject.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j.poobest on 9/24/2017 AD.
 */

public class DerpData {

    private static final String[] nameMenu = {"กระเพรา", "กระเพรา", "กระเพรา", "กระเพรา", "กระเพรา", "กระเพรา"};
    private static final int[] idImgMenu = {R.drawable.mock1, R.drawable.mock1, R.drawable.mock1,
            R.drawable.mock1, R.drawable.mock1, R.drawable.mock1,};

    public static List<MenuListItem> getListData() {
        List<MenuListItem> data = new ArrayList<>();
        for (int i = 0; i < nameMenu.length && i < idImgMenu.length; i++) {
            MenuListItem item = new MenuListItem();
            item.setNameMenu(nameMenu[i]);
            item.setIdImgMenu(idImgMenu[i]);
            data.add(item);
        }
        return data;
    }


}
