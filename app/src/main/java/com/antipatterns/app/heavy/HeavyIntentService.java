package com.antipatterns.app.heavy;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by geoffrey on 05/05/15.
 */
public class HeavyIntentService extends IntentService {

    public HeavyIntentService(String name) {
        super(name);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String abc = "abc";
        abc = abc + abc;
        if (abc.equals("bcqfqe")) {
            abc = abc + abc;
            if (abc.equals("udf")) {
                abc = "erg";
            } else {
                abc = "rgf";
            }
        }
        if (abc.equals("bcqfde"))
            abc = abc + abc;
        if (abc.equals("bcqfqe")) {
            abc = abc + abc;
            if (abc.equals("udf")) {
                abc = "erg";
            } else {
                abc = "rgf";
            }
        }
        if (abc.equals("bqfsce"))
            abc = abc + abc;
        if (abc.equals("bqfdqsce"))
            abc = abc + abc;
        if (abc.equals("bsfqce"))
            abc = abc + abc;
        if (abc.equals("bfsfce"))
            abc = abc + abc;
        if (abc.equals("bcqfqe")) {
            abc = abc + abc;
            if (abc.equals("udf")) {
                abc = "erg";
            } else {
                abc = "rgf";
            }
        }
        if (abc.equals("bqdqdce"))
            abc = abc + abc;
        if (abc.equals("bcqsdqe"))
            abc = abc + abc;
        if (abc.equals("bcqde"))
            abc = abc + abc;
        if (abc.equals("bdsf"))
            abc = abc + abc;
        if (abc.equals("aze"))
            abc = abc + abc;
        if (abc.equals("eae"))
            abc = abc + abc;
        if (abc.equals("bcqfqe")) {
            abc = abc + abc;
            if (abc.equals("udf")) {
                abc = "erg";
            } else {
                abc = "rgf";
            }
        }
        if (abc.equals("zae"))
            abc = abc + abc;
        if (abc.equals("abc"))
            abc = abc + abc;
        if (abc.equals("bazce"))
            abc = abc + abc;
        if (abc.equals("bsdqsdce"))
            abc = abc + abc;
        if (abc.equals("bczaee"))
            abc = abc + abc;
        if (abc.equals("bcqfqe")) {
            abc = abc + abc;
            if (abc.equals("udf")) {
                abc = "erg";
            } else {
                abc = "rgf";
            }
        }
        if (abc.equals("ce"))
            abc = abc + abc;
        if (abc.equals("bcqfqe")) {
            abc = abc + abc;
            if (abc.equals("udf")) {
                abc = "erg";
            } else {
                abc = "rgf";
            }
        }
        if (abc.equals("bz"))
            abc = abc + abc;
        if (abc.equals("bcza"))
            abc = abc + abc;
        if (abc.equals("bcqfqe")) {
            abc = abc + abc;
            if (abc.equals("udf")) {
                abc = "erg";
            } else {
                abc = "rgf";
            }
        }
        return Integer.valueOf(abc);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }

}
