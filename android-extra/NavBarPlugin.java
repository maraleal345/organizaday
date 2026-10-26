package com.agenda.remessas;

import android.graphics.Color;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "NavBar")
public class NavBarPlugin extends Plugin {

    @PluginMethod
    public void setColor(final PluginCall call) {
        final String color = call.getString("color", "#1d4ed8");
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    getActivity().getWindow().setNavigationBarColor(Color.parseColor(color));
                } catch (Exception e) {
                    // cor invalida: ignora
                }
                call.resolve();
            }
        });
    }
}
