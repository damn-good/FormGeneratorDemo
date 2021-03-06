package com.firminapp.formgenerator.models;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.firminapp.formgenerator.config.DViewType;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by firmin on 20/01/18.
 */

public class DtextView extends android.support.v7.widget.AppCompatTextView {
    private JSONObject jsondescriptor;
    private String kefield;
    private DViewType viewType;
    public DtextView(Context context,JSONObject descriptor) {
        super(context);
        this.viewType=DViewType.Dtextview;
        this.jsondescriptor=descriptor;
        String text= null;
        try {
            text = jsondescriptor.has("label")?this.jsondescriptor.getString("label"):"";
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.setText(text);

    }

    public DtextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DtextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public  DtextView generate(){
        return this;
    }
}
