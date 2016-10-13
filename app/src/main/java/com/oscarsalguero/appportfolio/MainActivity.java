/***
 * Copyright (c) 2016 Oscar Salguero www.oscarsalguero.com
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.oscarsalguero.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Main Activity
 * Displays a few buttons that when clicked will show a toast / launch another app.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Shows a toast when a view (in this case a button) is clicked
     *
     * @param v the {@link View} that was clicked
     */
    public void showToast(View v) {
        String appName = null;
        switch (v.getId()) {
            case R.id.button_popular_movies:
                appName = getString(R.string.app_title_popular_movies);
                break;
            case R.id.button_stock_hawk:
                appName = getString(R.string.app_title_stock_hawk);
                break;
            case R.id.button_build_it_bigger:
                appName = getString(R.string.app_title_build_it_bigger);
                break;
            case R.id.button_make_your_app_material:
                appName = getString(R.string.app_title_make_your_app_material);
                break;
            case R.id.button_go_ubiquitous:
                appName = getString(R.string.app_title_go_ubiquitous);
                break;
            case R.id.button_capstone:
                appName = getString(R.string.app_title_capstone);
                break;
            default:
                break;
        }
        Toast.makeText(MainActivity.this, getString(R.string.description_toast, appName), Toast.LENGTH_SHORT).show();
        // TODO: Launch another app
    }

}
