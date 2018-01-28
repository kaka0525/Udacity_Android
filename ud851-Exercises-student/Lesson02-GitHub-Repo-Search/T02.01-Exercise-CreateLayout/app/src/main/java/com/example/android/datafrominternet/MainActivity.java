/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.datafrominternet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText mSearchBoxEditText;
    TextView mUrlDisplayTextView;
    TextView mSearchResultsTextView;

    // Completed (26) Create an EditText variable called mSearchBoxEditText
    // Completed (27) Create a TextView variable called mUrlDisplayTextView
    // Completed (28) Create a TextView variable called mSearchResultsTextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearchBoxEditText = (EditText)findViewById(R.id.et_search_box);
        mUrlDisplayTextView = (TextView)findViewById(R.id.tv_url_display);
        mSearchResultsTextView = (TextView)findViewById(R.id.tv_github_search_results_json);
        // Completed (29) Use findViewById to get a reference to mSearchBoxEditText
        // Completed (30) Use findViewById to get a reference to mUrlDisplayTextView
        // Completed (31) Use findViewById to get a reference to mSearchResultsTextView
    }
}
