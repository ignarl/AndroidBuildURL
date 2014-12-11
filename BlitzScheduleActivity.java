            final String OMDB_URL = "http://www.omdbapi.com/?"; 
            Uri buildUri = Uri.parse(OMDB_URL).buildUpon()
                            .appendQueryParameter("t", "Edge of Tomorrow")
                            .build();

            try {
                URL apiURL = new URL(buildUri.toString());
                Log.d("API ", apiURL.toString());
                Utility utils = new Utility();
                utils.getJSONfromURL(apiURL.toString());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }