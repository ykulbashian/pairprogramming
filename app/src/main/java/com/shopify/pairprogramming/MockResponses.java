package com.shopify.pairprogramming;

public class MockResponses {
    
    public static final String shopifyCheckout =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2015-09-21T16:19:13-04:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": null," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"c128f1b20ee5b0d9959ce2ac877447f7\"," +
            "            \"updated_at\": \"2015-09-21T16:19:13-04:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/us-west-2-deposit.cs.shopify.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/c128f1b20ee5b0d9959ce2ac877447f7\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"94a1ad4d716a7790\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"billing_address\": {" +
            "                \"first_name\": \"---\"," +
            "                \"last_name\": \"---\"," +
            "                \"phone\": \"---\"," +
            "                \"address1\": \"---\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    
    public static final String shopifyProductListings =
            "{" +
            "    \"body\": {" +
            "        \"product_listings\": [{" +
            "            \"id\": 3186044355," +
            "            \"product_id\": 2576257283," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-09-14T11:23:04-04:00\"," +
            "            \"updated_at\": \"2015-10-08T12:46:33-04:00\"," +
            "            \"body_html\": \"A shirt with lots of variants\"," +
            "            \"handle\": \"shirt\"," +
            "            \"product_type\": \"\"," +
            "            \"title\": \"Shirt\"," +
            "            \"vendor\": \"MobileBuySDKTestShop\"," +
            "            \"published_at\": \"2015-09-14T11:23:03-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"cotton, summer, Vintage\"," +
            "            \"images\": []," +
            "            \"options\": [{" +
            "                \"id\": 3098335939," +
            "                \"name\": \"Size\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 1" +
            "            }, {" +
            "                \"id\": 3098336003," +
            "                \"name\": \"Neck\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 2" +
            "            }, {" +
            "                \"id\": 3098336067," +
            "                \"name\": \"Color\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 3" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 7522060675," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522060739," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 2," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522060867," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 3," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061123," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 4," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061315," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 5," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061635," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 6," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061891," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 7," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062147," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 8," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062339," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 9," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062531," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 10," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062787," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 11," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063043," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 12," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063235," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 13," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063491," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 14," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063683," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 15," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064003," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 16," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064323," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 17," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064643," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 18," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065091," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 19," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065475," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 20," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065731," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 21," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066051," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 22," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066435," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 23," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066819," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 24," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067203," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 25," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067523," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 26," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067843," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 27," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068099," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 28," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068483," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 29," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068739," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 30," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";


}