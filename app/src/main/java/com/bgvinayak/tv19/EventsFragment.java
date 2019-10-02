package com.bgvinayak.tv19;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {

    Button csebtn,ecebtn,civbtn,mechbtn,eeebtn,mbabtn;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_events, container, false);

        csebtn = (Button) view.findViewById(R.id.csebtn);
        csebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),CseActivity.class);
                startActivity(intent);
            }
        });
        return  view;

    }

}
