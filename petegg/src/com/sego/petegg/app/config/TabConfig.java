/**
 * TabConfig.java 
 * classes : com.sego.petegg.app.config.TabConfig
 * ldp Create at 2016-3-16 上午8:39:26  
 */

package com.sego.petegg.app.config;

import com.sego.petegg.R;
import com.sego.petegg.app.fragment.nearby.NearbyFragment;
import com.sego.petegg.app.fragment.personal.PersonalFragment;
import com.sego.petegg.app.fragment.petlist.PetlistFragment;
import com.sego.petegg.app.fragment.sego.SegoFragment;
import com.sego.petegg.app.fragment.square.SquareFragment;

/**
 * com.sego.petegg.app.config.TabConfig
 * 
 * @author ldp
 * 
 *         create at 2016-3-16 上午8:39:26
 */

public class TabConfig {
	public static int[] getTabsTxt() {
		int[] tabs = { R.string.tab_square, R.string.tab_nearby,
				R.string.tab_sego, R.string.tab_petlist, R.string.tab_personal };
		return tabs;
	}

	public static int[] getTabsImg() {
		int[] ids = { R.drawable.tab_square_choose_no,
				R.drawable.tab_nearby_choose_no, R.drawable.tab_sego_choose_no,
				R.drawable.tab_petlist_choose_no,
				R.drawable.tab_person_choose_no };
		return ids;
	}

	public static int[] getTabsImgLight() {
		int[] ids = { R.drawable.tab_square_choose,
				R.drawable.tab_nearby_choose, R.drawable.tab_sego_choose,
				R.drawable.tab_petlist_choose, R.drawable.tab_person_choose };
		return ids;
	}

	public static Class[] getFragments() {
		Class[] clz = { SquareFragment.class, NearbyFragment.class,
				SegoFragment.class, PetlistFragment.class,
				PersonalFragment.class

		};
		return clz;
	}
}
