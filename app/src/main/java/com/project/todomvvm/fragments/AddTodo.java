package com.project.todomvvm.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.todomvvm.R;
import com.project.todomvvm.databinding.FragmentAddTodoBinding;

public class AddTodo extends Fragment {

    private FragmentAddTodoBinding addTodoBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        addTodoBinding = FragmentAddTodoBinding.inflate(getLayoutInflater());
        View view = addTodoBinding.getRoot();

        return view;
    }

    public void addClick(View view) {

    }
}