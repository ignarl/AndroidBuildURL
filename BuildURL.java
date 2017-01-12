     public static URL buildUrl(String locationQuery) {
+        Uri builtUri = Uri.parse(FORECAST_BASE_URL).buildUpon()
+                .appendQueryParameter(QUERY_PARAM, locationQuery)
+                .appendQueryParameter(FORMAT_PARAM, format)
+                .appendQueryParameter(UNITS_PARAM, units)
+                .appendQueryParameter(DAYS_PARAM, Integer.toString(numDays))
+                .build();
+
+        URL url = null;
+        try {
+            url = new URL(builtUri.toString());
+        } catch (MalformedURLException e) {
+            e.printStackTrace();
+        }
+
+        Log.v(TAG, "Built URI " + url);
+
+        return url;
     }
