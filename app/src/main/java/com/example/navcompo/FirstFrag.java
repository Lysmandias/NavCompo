package com.example.navcompo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        return view;
    }
    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedIntanceState) {
        super.onViewCreated(view, savedIntanceState);

        View.OnClickListener firstTo2nd = Navigation.createNavigateOnClickListener(R.id.action_firstFrag_to_secondFrag);
        ConstraintLayout cl1 = view.findViewById(R.id.firstFrag);
        cl1.setOnClickListener(firstTo2nd);
    }
}