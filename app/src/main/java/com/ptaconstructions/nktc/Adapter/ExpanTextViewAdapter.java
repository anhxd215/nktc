package com.ptaconstructions.nktc.Adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.ptaconstructions.nktc.R;

public class ExpanTextViewAdapter extends BaseExpandableListAdapter {
    Context context;
//Tạo ra một mảng để chứa các text tiêu đề,mỗi tiêu đề mở rộng được ra
    // Phần thông tin mở rộng của nhân viên chỉ có một thông tin nên mảng chỉ có 1pt
    // Lần sau muốn thêm thì bổ sung vào đây

    String[] ListTitleExpan = {"Thông tin bổ sung"};
    // Tạo ra một mảng khác
    String[][] ListContentExpan = {{"1"}};


    public ExpanTextViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return ListTitleExpan.length;
    }

    @Override
    public int getChildrenCount(int i) {
        return ListContentExpan[i].length;
    }

    @Override
    public Object getGroup(int i) {
        return ListTitleExpan[i];
    }

    @Override
    public Object getChild(int i, int i1) {
        return ListContentExpan[i][i1];
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.expan_listview_title, null);

        }
        String textViewData = (String) getGroup(i);
        TextView textView = view.findViewById(R.id.tvTitleExListView);
        textView.setText(textViewData);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.expan_listview_content, null);
        }
// Không có bước gán vào vì nó không có dữ liệu gì để gán cả.
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
