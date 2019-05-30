package com.model;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.http.request;
import com.model.JsonModel.ResultBean.SeasonsBean;

/*
 * 哔哩哔哩新番模型类
 * */
public class JsonModel {

	    /**
	     * code : 0
	     * message : success
	     * result : [{"date":"5-24","date_ts":1558627200,"day_of_week":5,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/e1015a803ad97406f9eddfbc6ad608cc965f8b05.png","delay":0,"ep_id":272614,"favorites":1177447,"follow":0,"is_published":1,"pub_index":"13(OVA)","pub_time":"09:00","pub_ts":1558659600,"season_id":26291,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/f622f9bba02ae2cd77b9f0db43497c167c63e201.jpg","title":"澶╀娇闄嶄复鍒版垜韬竟"},{"cover":"http://i0.hdslb.com/bfs/bangumi/956d61c245c5ac99ac8063f92402ce9c89243475.png","delay":0,"ep_id":267756,"favorites":1152985,"follow":0,"is_published":1,"pub_index":"绗�7璇�","pub_time":"21:30","pub_ts":1558704600,"season_id":26769,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/150bc1749f94467d51b7d09ed639eb2837e4fc8e.jpg","title":"鏂囪豹閲庣姮聽绗笁瀛�"}]},{"date":"5-25","date_ts":1558713600,"day_of_week":6,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/368c60d973a8a3251534f599dcb2eff7fc64cef3.png","delay":0,"ep_id":267769,"favorites":573105,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"01:23","pub_ts":1558718580,"season_id":26766,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/50ae3da8e02efbbffba52f5c3406891cec8cb392.jpg","title":"姘存灉绡瓙 (2019)"},{"cover":"http://i0.hdslb.com/bfs/bangumi/e186f2451e45a60952229077111f40fd08b8516c.png","delay":0,"ep_id":268067,"favorites":7436,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"01:23","pub_ts":1558718580,"season_id":26960,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/72a27fb9263f54da7f900627badc3d4bcaf51af5.png","title":"鐢熻倴濂囩紭 (2019)锛堝儏闄愭腐婢冲湴鍗�锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/f34ff3975c39913af936c133ae60a5891babba08.png","delay":0,"ep_id":250644,"favorites":1870663,"follow":0,"is_published":1,"pub_index":"绗�31璇�","pub_time":"01:35","pub_ts":1558719300,"season_id":25681,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/9af6bb684c8650578c1f5f435b57cd4ea1cba952.jpg","title":"JOJO鐨勫濡欏啋闄� 榛勯噾涔嬮"},{"cover":"http://i0.hdslb.com/bfs/bangumi/247c5e89bc9b26e8302830b4eb316c3af0409a47.png","delay":0,"ep_id":267794,"favorites":906716,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"02:10","pub_ts":1558721400,"season_id":26870,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/d1c7df14e858bb9e5e7a2fd46b6f9f6ae0dbd6db.jpg","title":"宸濇煶灏戝コ"},{"cover":"http://i0.hdslb.com/bfs/bangumi/5d3139f10d3eb2cb962932007287d23ef83d8995.png","delay":0,"ep_id":267806,"favorites":104851,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"02:25","pub_ts":1558722300,"season_id":26953,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/ca1b30756686c49fc0ac7c60be6a8a02110857fe.jpg","title":"婊胯叇閮芥槸鈼嬧棆鐨勬垜娌掕睛娉曡珖鎴�鎰涳紙鍍呴檺鍙扮仯鍦板崁锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/a3b2db2edeeac4fb51446724458cf93fe46d2797.jpg","delay":0,"ep_id":267818,"favorites":558331,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"02:55","pub_ts":1558724100,"season_id":26818,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/03ff5d139507c641a5be2a04686614d2c821e971.jpg","title":"涓�涓汉鐨勩�囥�囧皬鏃ュ瓙"},{"cover":"http://i0.hdslb.com/bfs/bangumi/357e75a1fb3e17a80b49f60af35f5d211d639921.jpg","delay":0,"ep_id":269833,"favorites":1936,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"05:30","pub_ts":1558733400,"season_id":26878,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/443295f14b859de64a5917122bd9e516673c689d.jpg","title":"鏆栨殩鏃ヨ 4th"},{"cover":"http://i0.hdslb.com/bfs/bangumi/c810285bf6e2f40a5ab7c1662ac637670a9cac2f.jpg","delay":0,"ep_id":267830,"favorites":104966,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"17:00","pub_ts":1558774800,"season_id":26770,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/6774dcb7ef7394558ba05071fa1f2a0498122d54.png","title":"MIX"},{"cover":"http://i0.hdslb.com/bfs/bangumi/c810285bf6e2f40a5ab7c1662ac637670a9cac2f.jpg","delay":0,"ep_id":268031,"favorites":1221,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"19:00","pub_ts":1558782000,"season_id":26958,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/0ed0e38871bfc4e822bac43d85ae745b854e0a14.png","title":"MIX锛堝儏闄愬彴鐏ｅ湴鍗�锛�"}]},{"date":"5-26","date_ts":1558800000,"day_of_week":7,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/9d9cd5a6a48428fe2e4b6ed17025707696eab47b.png","delay":0,"ep_id":267858,"favorites":2221536,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"00:00","pub_ts":1558800000,"season_id":26801,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/da6820b316c1197cb063107deb061a3ebe58486b.png","title":"楝肩伃涔嬪垉"},{"cover":"http://i0.hdslb.com/bfs/bangumi/edbdecd451315bc573ed22009f68efdd4ab91bed.png","delay":0,"ep_id":267904,"favorites":17053,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"00:00","pub_ts":1558800000,"season_id":26954,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/528a3f895f689dc0866f8ee74bd99ec8cad7864c.jpg","title":"楝兼粎涔嬪垉锛堝儏闄愬彴鐏ｅ湴鍗�锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/7625ac0a9409923bd3b285a978aeba04db4fd406.png","delay":0,"ep_id":267886,"favorites":1125847,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"01:00","pub_ts":1558803600,"season_id":26767,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/c2a12ee17389ef928e5ecee2240cf51788a3a7d0.jpg","title":"鎴戜滑鏃犳硶涓�璧峰涔�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/a78db70a46cb819aa21dddcfe4d22f631cd0bedd.png","delay":0,"ep_id":268018,"favorites":10430,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"01:00","pub_ts":1558803600,"season_id":26957,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/60197e52cc86a2e721e69a7593460bfcf3f1970d.jpg","title":"鎴戝�戠湡鐨勫涓嶄締锛侊紙鍍呴檺鍙扮仯鍦板崁锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/9fe9fdf6651595aa6b16745d61cb497da3de649f.png","delay":0,"ep_id":268055,"favorites":19893,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"01:30","pub_ts":1558805400,"season_id":26959,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/aca017626d464fe992647a016f7837fa49562b05.jpg","title":"涓�寮﹀畾闊筹紒锛堝儏闄愭腐婢冲彴鍦板崁锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/c200e369e9cd98a024f0a58f4363935e69cd044b.jpg","delay":0,"ep_id":251573,"favorites":19355,"follow":0,"is_published":1,"pub_index":"绗�33璇�","pub_time":"06:54","pub_ts":1558824840,"season_id":25851,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/7cd6c47770dc96e329fecd89f78b012267420c35.jpg","title":"鐖辩帺鎬吔"},{"cover":"http://i0.hdslb.com/bfs/bangumi/16eae08b6541d34d0040ecd12783c9d3f88fd063.jpg","delay":0,"ep_id":268349,"favorites":29809,"follow":0,"is_published":1,"pub_index":"绗�59璇�","pub_time":"10:00","pub_ts":1558836000,"season_id":23841,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/5c2f289eac0ec49bc5e6b9483f4191c42ffa2254.jpg","title":"缇庡鈽嗛閬�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/264a2252fc7ab3503d5e7b879b0ba64cf7f80831.jpg","delay":0,"ep_id":271287,"favorites":1796275,"follow":0,"is_published":1,"pub_index":"绗�108璇�","pub_time":"17:30","pub_ts":1558863000,"season_id":5978,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/3121473d5dd03a9bcccb8490034207e724e731b3.jpg","title":"鍗氫汉浼� 鐏奖蹇嶈�呮柊鏃朵唬"},{"cover":"http://i0.hdslb.com/bfs/bangumi/e308d1810b484da73da10a20f25ebc7882e187db.png","delay":0,"ep_id":268144,"favorites":430339,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"23:30","pub_ts":1558884600,"season_id":26777,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/81fe8b87acd49e28fbc801b929076a7bdd67f8c8.jpg","title":"娣卞鐨勮秴鑷劧鍏姟鍛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/73af520e05405ef28a09b59e7893f5d675368f86.png","delay":0,"ep_id":268132,"favorites":238772,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"23:30","pub_ts":1558884600,"season_id":26871,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/e950286f1239c0fd2c69ae5a3ad0f6b43cfe7fb9.jpg","title":"娑堢伃閮藉競"}]},{"date":"5-27","date_ts":1558886400,"day_of_week":1,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/0966ed9776add4b8948a07402249a6d5ba9d65b8.png","delay":1,"delay_id":196,"delay_index":"绗�8璇�","delay_reason":"鏈懆鍋滄洿","ep_id":0,"favorites":115615,"follow":0,"is_published":0,"pub_time":"01:35","pub_ts":1558892100,"season_id":26775,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/9495024f7fc52e8f38e16f86b901bfc6d978aee5.jpg","title":"鍏湀鐨勬鐞冪敎蹇�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/6351a8acf68bfcc112b7d0358df6f97ba26d59dc.png","delay":1,"delay_id":197,"delay_index":"绗�8璇�","delay_reason":"鏈�卞仠鏇�","ep_id":0,"favorites":2874,"follow":0,"is_published":0,"pub_time":"01:35","pub_ts":1558892100,"season_id":26962,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/25be603f0d454bbbce27aabca00ee5410a3a1e5f.jpg","title":"鍏湀鐨勬鐞冪敎蹇冿紙鍍呴檺娓境鍙板湴鍗�锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/0b9718fbeefb2b645428b3a1c577c00d882a7ef3.png","delay":0,"ep_id":268180,"favorites":124088,"follow":0,"is_published":1,"pub_index":"绗�17璇�","pub_time":"13:00","pub_ts":1558933200,"season_id":26963,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/f5d1a61085d464e9d494168ec994fcf0594b0ba5.jpg","title":"閫叉搳鐨勫法浜� 绗笁瀛� Part.2锛堝儏闄愬彴鐏ｅ湴鍗�锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/4783d1ba927a0d744963d721d8446130c6391b06.jpg","delay":0,"ep_id":271321,"favorites":12916,"follow":0,"is_published":1,"pub_index":"绗�60璇�","pub_time":"18:20","pub_ts":1558952400,"season_id":23882,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/4143c286982fd8f9ad467af7b6e4a74aaee1c026.jpg","title":"鏅洪緳杩峰煄"},{"cover":"http://i0.hdslb.com/bfs/bangumi/3fc16a667502cbff226e585eb660a96a20c7458c.png","delay":0,"ep_id":259718,"favorites":3140219,"follow":0,"is_published":1,"pub_index":"绗�20璇�","pub_time":"22:00","pub_ts":1558965600,"season_id":26146,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/966544071d5bfcf1d244bad7f6ce623310407db9.jpg","title":"澶氱綏缃�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/3142ad3fe1abb98c0992915862c9e416cb6c69fe.png","delay":0,"ep_id":267434,"favorites":235771,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"23:30","pub_ts":1558971000,"season_id":26917,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/e7aa5de00c57fbda930a4e4b0f8b79acd448a418.jpg","title":"RobiHachi"}]},{"date":"5-28","date_ts":1558972800,"day_of_week":2,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/c345335f3cc395f7cfbe7e7e0a4913f9b1671fe2.jpg","delay":0,"ep_id":272683,"favorites":1008464,"follow":0,"is_published":1,"pub_index":"绗�85璇�","pub_time":"18:25","pub_ts":1559039100,"season_id":6422,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/1d703634cd3ee35b625bf882f27289db301cae63.jpg","title":"榛戣壊鍥涘彾鑽�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/b8d656fdb0931e812373daf3d4cb04eb93b4c227.jpg","delay":0,"ep_id":267447,"favorites":82819,"follow":0,"is_published":1,"pub_index":"绗�9璇�","pub_time":"18:30","pub_ts":1559039400,"season_id":26809,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/c451451d617ed21096b1c5fabb788f8514bfc272.png","title":"閽荤煶鐜嬬墝 actII"},{"cover":"http://i0.hdslb.com/bfs/bangumi/8d594ce60af3068a182d9d498f317de7ff51668e.jpg","delay":1,"delay_id":198,"delay_index":"绗�8璇�","delay_reason":"鏈懆鍋滄洿","ep_id":0,"favorites":6932,"follow":0,"is_published":0,"pub_time":"20:00","pub_ts":1559044800,"season_id":26879,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/c90f5653ac1577f2fb5f49e82897bb5754f3c1d3.jpg","title":"灏戝勾闃胯礉 GO!GO!灏忚姖楹� 绗洓瀛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/20495aad08b939ff9e1d6a0dd0818d885b320dc0.jpg","delay":0,"ep_id":267472,"favorites":26750,"follow":0,"is_published":1,"pub_index":"绗�48璇�","pub_time":"21:54","pub_ts":1559051640,"season_id":26876,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/df7f7ad9b2a954f5df232fc718f1d573fb9486ce.jpg","title":"鍋跺儚澶у笀鐏板濞樺墽鍦� 绗洓瀛ｏ紙TV鐗堬級"},{"cover":"http://i0.hdslb.com/bfs/bangumi/20495aad08b939ff9e1d6a0dd0818d885b320dc0.jpg","delay":0,"ep_id":273168,"favorites":5497,"follow":0,"is_published":1,"pub_index":"绗�38璇�","pub_time":"21:54","pub_ts":1559051640,"season_id":26940,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/a6bb265fff84870df629bc94eaaa0be598719b04.png","title":"鍋跺儚澶у笀鐏板濞樺墽鍦� 绗洓瀛ｏ紙WEB鐗堬級"},{"cover":"http://i0.hdslb.com/bfs/bangumi/8b1ee76937d7425e981496df7b4edef69050a79d.jpg","delay":0,"ep_id":270953,"favorites":15586,"follow":0,"is_published":1,"pub_index":"绗�9璇�","pub_time":"22:00","pub_ts":1559052000,"season_id":27728,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/077170bcb5bfa41437fa1dc3bf123467b5c1357d.jpg","title":"YU-NO 鍦ㄩ�欎笘鐣岀洝闋鍞辨剾鐨勫皯濂筹紙鍍呴檺娓境鍙板湴鍗�锛�"}]},{"date":"5-29","date_ts":1559059200,"day_of_week":3,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/41c2658772fe2c1c3e15b0a72e31d0ac502e1e72.png","delay":0,"ep_id":268773,"favorites":8416,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"00:30","pub_ts":1559061000,"season_id":26941,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/d5afe308aadd1641f58a39d55ebd707a571655d9.jpg","title":"寮疯ゲ榄斿コ 501閮ㄩ殜鍑哄嫊!锛堝儏闄愬彴鐏ｅ湴鍗�锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/de944b7c9306932d8dd3dcaeaf2eeec8670deec5.png","delay":0,"ep_id":259694,"favorites":2966040,"follow":0,"is_published":1,"pub_index":"绗�21璇�","pub_time":"22:00","pub_ts":1559138400,"season_id":26284,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/f02cf4282f5dec97d96c8b6afc4301f6bb831cc6.jpg","title":"鐩句箣鍕囪�呮垚鍚嶅綍"},{"cover":"http://i0.hdslb.com/bfs/bangumi/d1f2baf4ea8217dd89d1aa3e45a75301b345b306.png","delay":0,"ep_id":267687,"favorites":1718652,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"23:30","pub_ts":1559143800,"season_id":26794,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/00edf581880f15117dcc8f2b5e16e48d4a8fdd38.jpg","title":"璐よ�呬箣瀛�"}]},{"date":"5-30","date_ts":1559145600,"day_of_week":4,"is_today":1,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/2e4708eb1fe628c23d09e570839f9ef484f0ca2e.png","delay":0,"ep_id":269574,"favorites":1418377,"follow":0,"is_published":1,"pub_index":"绗�8璇�","pub_time":"04:30","pub_ts":1559161800,"season_id":26875,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/826153e521ace94f60016a2a0fadb22256167cf3.jpg","title":"CAROLE & TUESDAY"},{"cover":"http://i0.hdslb.com/bfs/bangumi/428ff8cc844876109af0c7d7e6a6827bd26a3eb6.png","delay":0,"ep_id":267700,"favorites":12094,"follow":0,"is_published":0,"pub_index":"绗�8璇�","pub_time":"20:49","pub_ts":1559220540,"season_id":26881,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/28424015ed6d55f186ca1c7d9cf81c0bc9244ad7.png","title":"棣欒晧鎬ぇ鍙� 鍛愬憪~鍛� 濂藉娲炵┐涔愬洯锛堢浜屽锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/d481b3ba7e50cb0db9175b9aeecbaff500491de0.jpg","delay":0,"ep_id":267729,"favorites":104064,"follow":0,"is_published":0,"pub_index":"绗�19璇�","pub_time":"21:00","pub_ts":1559221200,"season_id":26880,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/4defae701060ab5dc1705a3a1068d9f2327413a1.jpg","title":"鍙涢�嗘�х櫨涓囦簹鐟熺帇 绗簩瀛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/b99f2fa76087f09362a932229b400325981fa1e0.png","delay":0,"ep_id":250777,"favorites":426860,"follow":0,"is_published":0,"pub_index":"绗�32璇�","pub_time":"22:30","pub_ts":1559226600,"season_id":25615,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/24fb6d80e5f8cadaddde930baf45cad924724047.png","title":"榄斿伓椹垙鍥�"}]},{"date":"5-31","date_ts":1559232000,"day_of_week":5,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/956d61c245c5ac99ac8063f92402ce9c89243475.png","delay":0,"ep_id":267757,"favorites":1152985,"follow":0,"is_published":0,"pub_index":"绗�8璇�","pub_time":"21:30","pub_ts":1559309400,"season_id":26769,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/150bc1749f94467d51b7d09ed639eb2837e4fc8e.jpg","title":"鏂囪豹閲庣姮聽绗笁瀛�"}]},{"date":"6-1","date_ts":1559318400,"day_of_week":6,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/11aaf66342197ea51f91a35509bd0b018dabc8d1.jpg","delay":0,"ep_id":270872,"favorites":2071,"follow":0,"is_published":0,"pub_index":"绗�15璇�","pub_time":"00:00","pub_ts":1559318400,"season_id":27698,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/7c641af3cc0d161ef273bb2d23d6f4d91a24143d.jpg","title":"娆㈣繋鏉ュ埌鍔犲笗閲屽叕鍥� 绗簩瀛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/e186f2451e45a60952229077111f40fd08b8516c.png","delay":0,"ep_id":268068,"favorites":7436,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"01:23","pub_ts":1559323380,"season_id":26960,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/72a27fb9263f54da7f900627badc3d4bcaf51af5.png","title":"鐢熻倴濂囩紭 (2019)锛堝儏闄愭腐婢冲湴鍗�锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/f34ff3975c39913af936c133ae60a5891babba08.png","delay":0,"ep_id":250645,"favorites":1870663,"follow":0,"is_published":0,"pub_index":"绗�32璇�","pub_time":"01:35","pub_ts":1559324100,"season_id":25681,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/9af6bb684c8650578c1f5f435b57cd4ea1cba952.jpg","title":"JOJO鐨勫濡欏啋闄� 榛勯噾涔嬮"},{"cover":"http://i0.hdslb.com/bfs/bangumi/247c5e89bc9b26e8302830b4eb316c3af0409a47.png","delay":0,"ep_id":267795,"favorites":906716,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"02:10","pub_ts":1559326200,"season_id":26870,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/d1c7df14e858bb9e5e7a2fd46b6f9f6ae0dbd6db.jpg","title":"宸濇煶灏戝コ"},{"cover":"http://i0.hdslb.com/bfs/bangumi/5d3139f10d3eb2cb962932007287d23ef83d8995.png","delay":0,"ep_id":267807,"favorites":104851,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"02:25","pub_ts":1559327100,"season_id":26953,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/ca1b30756686c49fc0ac7c60be6a8a02110857fe.jpg","title":"婊胯叇閮芥槸鈼嬧棆鐨勬垜娌掕睛娉曡珖鎴�鎰涳紙鍍呴檺鍙扮仯鍦板崁锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/a3b2db2edeeac4fb51446724458cf93fe46d2797.jpg","delay":0,"ep_id":267819,"favorites":558331,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"02:55","pub_ts":1559328900,"season_id":26818,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/03ff5d139507c641a5be2a04686614d2c821e971.jpg","title":"涓�涓汉鐨勩�囥�囧皬鏃ュ瓙"},{"cover":"http://i0.hdslb.com/bfs/bangumi/357e75a1fb3e17a80b49f60af35f5d211d639921.jpg","delay":0,"ep_id":269834,"favorites":1936,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"05:30","pub_ts":1559338200,"season_id":26878,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/443295f14b859de64a5917122bd9e516673c689d.jpg","title":"鏆栨殩鏃ヨ 4th"},{"cover":"http://i0.hdslb.com/bfs/bangumi/368c60d973a8a3251534f599dcb2eff7fc64cef3.png","delay":0,"ep_id":267770,"favorites":573105,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"09:00","pub_ts":1559350800,"season_id":26766,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/50ae3da8e02efbbffba52f5c3406891cec8cb392.jpg","title":"姘存灉绡瓙 (2019)"},{"cover":"http://i0.hdslb.com/bfs/bangumi/c810285bf6e2f40a5ab7c1662ac637670a9cac2f.jpg","delay":0,"ep_id":267831,"favorites":104966,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"17:00","pub_ts":1559379600,"season_id":26770,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/6774dcb7ef7394558ba05071fa1f2a0498122d54.png","title":"MIX"},{"cover":"http://i0.hdslb.com/bfs/bangumi/c810285bf6e2f40a5ab7c1662ac637670a9cac2f.jpg","delay":0,"ep_id":268032,"favorites":1221,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"19:00","pub_ts":1559386800,"season_id":26958,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/0ed0e38871bfc4e822bac43d85ae745b854e0a14.png","title":"MIX锛堝儏闄愬彴鐏ｅ湴鍗�锛�"}]},{"date":"6-2","date_ts":1559404800,"day_of_week":7,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/9d9cd5a6a48428fe2e4b6ed17025707696eab47b.png","delay":0,"ep_id":267859,"favorites":2221536,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"00:00","pub_ts":1559404800,"season_id":26801,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/da6820b316c1197cb063107deb061a3ebe58486b.png","title":"楝肩伃涔嬪垉"},{"cover":"http://i0.hdslb.com/bfs/bangumi/edbdecd451315bc573ed22009f68efdd4ab91bed.png","delay":0,"ep_id":267905,"favorites":17053,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"00:00","pub_ts":1559404800,"season_id":26954,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/528a3f895f689dc0866f8ee74bd99ec8cad7864c.jpg","title":"楝兼粎涔嬪垉锛堝儏闄愬彴鐏ｅ湴鍗�锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/7625ac0a9409923bd3b285a978aeba04db4fd406.png","delay":0,"ep_id":267887,"favorites":1125847,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"01:00","pub_ts":1559408400,"season_id":26767,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/c2a12ee17389ef928e5ecee2240cf51788a3a7d0.jpg","title":"鎴戜滑鏃犳硶涓�璧峰涔�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/a78db70a46cb819aa21dddcfe4d22f631cd0bedd.png","delay":0,"ep_id":268019,"favorites":10430,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"01:00","pub_ts":1559408400,"season_id":26957,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/60197e52cc86a2e721e69a7593460bfcf3f1970d.jpg","title":"鎴戝�戠湡鐨勫涓嶄締锛侊紙鍍呴檺鍙扮仯鍦板崁锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/9fe9fdf6651595aa6b16745d61cb497da3de649f.png","delay":0,"ep_id":268056,"favorites":19893,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"01:30","pub_ts":1559410200,"season_id":26959,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/aca017626d464fe992647a016f7837fa49562b05.jpg","title":"涓�寮﹀畾闊筹紒锛堝儏闄愭腐婢冲彴鍦板崁锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/c200e369e9cd98a024f0a58f4363935e69cd044b.jpg","delay":0,"ep_id":251574,"favorites":19355,"follow":0,"is_published":0,"pub_index":"绗�34璇�","pub_time":"06:54","pub_ts":1559429640,"season_id":25851,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/7cd6c47770dc96e329fecd89f78b012267420c35.jpg","title":"鐖辩帺鎬吔"},{"cover":"http://i0.hdslb.com/bfs/bangumi/16eae08b6541d34d0040ecd12783c9d3f88fd063.jpg","delay":0,"ep_id":268350,"favorites":29809,"follow":0,"is_published":0,"pub_index":"绗�60璇�","pub_time":"10:00","pub_ts":1559440800,"season_id":23841,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/5c2f289eac0ec49bc5e6b9483f4191c42ffa2254.jpg","title":"缇庡鈽嗛閬�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/264a2252fc7ab3503d5e7b879b0ba64cf7f80831.jpg","delay":0,"ep_id":271288,"favorites":1796275,"follow":0,"is_published":0,"pub_index":"绗�109璇�","pub_time":"17:30","pub_ts":1559467800,"season_id":5978,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/3121473d5dd03a9bcccb8490034207e724e731b3.jpg","title":"鍗氫汉浼� 鐏奖蹇嶈�呮柊鏃朵唬"},{"cover":"http://i0.hdslb.com/bfs/bangumi/e308d1810b484da73da10a20f25ebc7882e187db.png","delay":0,"ep_id":268145,"favorites":430339,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"23:30","pub_ts":1559489400,"season_id":26777,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/81fe8b87acd49e28fbc801b929076a7bdd67f8c8.jpg","title":"娣卞鐨勮秴鑷劧鍏姟鍛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/73af520e05405ef28a09b59e7893f5d675368f86.png","delay":0,"ep_id":268133,"favorites":238772,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"23:30","pub_ts":1559489400,"season_id":26871,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/e950286f1239c0fd2c69ae5a3ad0f6b43cfe7fb9.jpg","title":"娑堢伃閮藉競"}]},{"date":"6-3","date_ts":1559491200,"day_of_week":1,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/0966ed9776add4b8948a07402249a6d5ba9d65b8.png","delay":0,"ep_id":268159,"favorites":115615,"follow":0,"is_published":0,"pub_index":"绗�8璇�","pub_time":"09:00","pub_ts":1559523600,"season_id":26775,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/9495024f7fc52e8f38e16f86b901bfc6d978aee5.jpg","title":"鍏湀鐨勬鐞冪敎蹇�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/6351a8acf68bfcc112b7d0358df6f97ba26d59dc.png","delay":0,"ep_id":268171,"favorites":2874,"follow":0,"is_published":0,"pub_index":"绗�8璇�","pub_time":"09:00","pub_ts":1559523600,"season_id":26962,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/25be603f0d454bbbce27aabca00ee5410a3a1e5f.jpg","title":"鍏湀鐨勬鐞冪敎蹇冿紙鍍呴檺娓境鍙板湴鍗�锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/0b9718fbeefb2b645428b3a1c577c00d882a7ef3.png","delay":0,"ep_id":268181,"favorites":124088,"follow":0,"is_published":0,"pub_index":"绗�18璇�","pub_time":"13:00","pub_ts":1559538000,"season_id":26963,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/f5d1a61085d464e9d494168ec994fcf0594b0ba5.jpg","title":"閫叉搳鐨勫法浜� 绗笁瀛� Part.2锛堝儏闄愬彴鐏ｅ湴鍗�锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/4783d1ba927a0d744963d721d8446130c6391b06.jpg","delay":0,"ep_id":271322,"favorites":12916,"follow":0,"is_published":0,"pub_index":"绗�61璇�","pub_time":"18:20","pub_ts":1559557200,"season_id":23882,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/4143c286982fd8f9ad467af7b6e4a74aaee1c026.jpg","title":"鏅洪緳杩峰煄"},{"cover":"http://i0.hdslb.com/bfs/bangumi/3fc16a667502cbff226e585eb660a96a20c7458c.png","delay":0,"ep_id":259719,"favorites":3140219,"follow":0,"is_published":0,"pub_index":"绗�21璇�","pub_time":"22:00","pub_ts":1559570400,"season_id":26146,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/966544071d5bfcf1d244bad7f6ce623310407db9.jpg","title":"澶氱綏缃�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/3142ad3fe1abb98c0992915862c9e416cb6c69fe.png","delay":0,"ep_id":267435,"favorites":235771,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"23:30","pub_ts":1559575800,"season_id":26917,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/e7aa5de00c57fbda930a4e4b0f8b79acd448a418.jpg","title":"RobiHachi"}]},{"date":"6-4","date_ts":1559577600,"day_of_week":2,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/c345335f3cc395f7cfbe7e7e0a4913f9b1671fe2.jpg","delay":0,"ep_id":273163,"favorites":1008464,"follow":0,"is_published":0,"pub_index":"绗�86璇�","pub_time":"18:25","pub_ts":1559643900,"season_id":6422,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/1d703634cd3ee35b625bf882f27289db301cae63.jpg","title":"榛戣壊鍥涘彾鑽�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/b8d656fdb0931e812373daf3d4cb04eb93b4c227.jpg","delay":0,"ep_id":267448,"favorites":82819,"follow":0,"is_published":0,"pub_index":"绗�10璇�","pub_time":"18:30","pub_ts":1559644200,"season_id":26809,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/c451451d617ed21096b1c5fabb788f8514bfc272.png","title":"閽荤煶鐜嬬墝 actII"},{"cover":"http://i0.hdslb.com/bfs/bangumi/8d594ce60af3068a182d9d498f317de7ff51668e.jpg","delay":0,"ep_id":267623,"favorites":6932,"follow":0,"is_published":0,"pub_index":"绗�8璇�","pub_time":"20:00","pub_ts":1559649600,"season_id":26879,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/c90f5653ac1577f2fb5f49e82897bb5754f3c1d3.jpg","title":"灏戝勾闃胯礉 GO!GO!灏忚姖楹� 绗洓瀛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/20495aad08b939ff9e1d6a0dd0818d885b320dc0.jpg","delay":0,"ep_id":267473,"favorites":26750,"follow":0,"is_published":0,"pub_index":"绗�49璇�","pub_time":"21:54","pub_ts":1559656440,"season_id":26876,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/df7f7ad9b2a954f5df232fc718f1d573fb9486ce.jpg","title":"鍋跺儚澶у笀鐏板濞樺墽鍦� 绗洓瀛ｏ紙TV鐗堬級"},{"cover":"http://i0.hdslb.com/bfs/bangumi/8b1ee76937d7425e981496df7b4edef69050a79d.jpg","delay":0,"ep_id":270954,"favorites":15586,"follow":0,"is_published":0,"pub_index":"绗�10璇�","pub_time":"22:00","pub_ts":1559656800,"season_id":27728,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/077170bcb5bfa41437fa1dc3bf123467b5c1357d.jpg","title":"YU-NO 鍦ㄩ�欎笘鐣岀洝闋鍞辨剾鐨勫皯濂筹紙鍍呴檺娓境鍙板湴鍗�锛�"}]},{"date":"6-5","date_ts":1559664000,"day_of_week":3,"is_today":0,"seasons":[{"cover":"http://i0.hdslb.com/bfs/bangumi/41c2658772fe2c1c3e15b0a72e31d0ac502e1e72.png","delay":0,"ep_id":268775,"favorites":8416,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"00:30","pub_ts":1559665800,"season_id":26941,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/d5afe308aadd1641f58a39d55ebd707a571655d9.jpg","title":"寮疯ゲ榄斿コ 501閮ㄩ殜鍑哄嫊!锛堝儏闄愬彴鐏ｅ湴鍗�锛�"},{"cover":"http://i0.hdslb.com/bfs/bangumi/de944b7c9306932d8dd3dcaeaf2eeec8670deec5.png","delay":0,"ep_id":259695,"favorites":2966040,"follow":0,"is_published":0,"pub_index":"绗�22璇�","pub_time":"22:00","pub_ts":1559743200,"season_id":26284,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/f02cf4282f5dec97d96c8b6afc4301f6bb831cc6.jpg","title":"鐩句箣鍕囪�呮垚鍚嶅綍"},{"cover":"http://i0.hdslb.com/bfs/bangumi/d1f2baf4ea8217dd89d1aa3e45a75301b345b306.png","delay":0,"ep_id":267688,"favorites":1718652,"follow":0,"is_published":0,"pub_index":"绗�9璇�","pub_time":"23:30","pub_ts":1559748600,"season_id":26794,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/00edf581880f15117dcc8f2b5e16e48d4a8fdd38.jpg","title":"璐よ�呬箣瀛�"}]}]
	     */

	    private int code;
	    private String message;
	    private List<ResultBean> result;

	    public int getCode() {
	        return code;
	    }

	    public void setCode(int code) {
	        this.code = code;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public List<ResultBean> getResult() {
	        return result;
	    }

	    public void setResult(List<ResultBean> result) {
	        this.result = result;
	    }

	    public static class ResultBean {
	        /**
	         * date : 5-24
	         * date_ts : 1558627200
	         * day_of_week : 5
	         * is_today : 0
	         * seasons : [{"cover":"http://i0.hdslb.com/bfs/bangumi/e1015a803ad97406f9eddfbc6ad608cc965f8b05.png","delay":0,"ep_id":272614,"favorites":1177447,"follow":0,"is_published":1,"pub_index":"13(OVA)","pub_time":"09:00","pub_ts":1558659600,"season_id":26291,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/f622f9bba02ae2cd77b9f0db43497c167c63e201.jpg","title":"澶╀娇闄嶄复鍒版垜韬竟"},{"cover":"http://i0.hdslb.com/bfs/bangumi/956d61c245c5ac99ac8063f92402ce9c89243475.png","delay":0,"ep_id":267756,"favorites":1152985,"follow":0,"is_published":1,"pub_index":"绗�7璇�","pub_time":"21:30","pub_ts":1558704600,"season_id":26769,"season_status":13,"square_cover":"http://i0.hdslb.com/bfs/bangumi/150bc1749f94467d51b7d09ed639eb2837e4fc8e.jpg","title":"鏂囪豹閲庣姮聽绗笁瀛�"}]
	         */

	        private String date;
	        private int date_ts;
	        private int day_of_week;
	        private int is_today;
	        private List<SeasonsBean> seasons;

	        public String getDate() {
	            return date;
	        }

	        public void setDate(String date) {
	            this.date = date;
	        }

	        public int getDate_ts() {
	            return date_ts;
	        }

	        public void setDate_ts(int date_ts) {
	            this.date_ts = date_ts;
	        }

	        public int getDay_of_week() {
	            return day_of_week;
	        }

	        public void setDay_of_week(int day_of_week) {
	            this.day_of_week = day_of_week;
	        }

	        public int getIs_today() {
	            return is_today;
	        }

	        public void setIs_today(int is_today) {
	            this.is_today = is_today;
	        }

	        public List<SeasonsBean> getSeasons() {
	            return seasons;
	        }

	        public void setSeasons(List<SeasonsBean> seasons) {
	            this.seasons = seasons;
	        }

	        public static class SeasonsBean {
	            /**
	             * cover : http://i0.hdslb.com/bfs/bangumi/e1015a803ad97406f9eddfbc6ad608cc965f8b05.png
	             * delay : 0
	             * ep_id : 272614
	             * favorites : 1177447
	             * follow : 0
	             * is_published : 1
	             * pub_index : 13(OVA)
	             * pub_time : 09:00
	             * pub_ts : 1558659600
	             * season_id : 26291
	             * season_status : 13
	             * square_cover : http://i0.hdslb.com/bfs/bangumi/f622f9bba02ae2cd77b9f0db43497c167c63e201.jpg
	             * title : 澶╀娇闄嶄复鍒版垜韬竟
	             */

	            private String cover;
	            private int delay;
	            private int ep_id;
	            private int favorites;
	            private int follow;
	            private int is_published;
	            private String pub_index;
	            private String pub_time;
	            private int pub_ts;
	            private int season_id;
	            private int season_status;
	            private String square_cover;
	            private String title;

	            public String getCover() {
	                return cover;
	            }

	            public void setCover(String cover) {
	                this.cover = cover;
	            }

	            public int getDelay() {
	                return delay;
	            }

	            public void setDelay(int delay) {
	                this.delay = delay;
	            }

	            public int getEp_id() {
	                return ep_id;
	            }

	            public void setEp_id(int ep_id) {
	                this.ep_id = ep_id;
	            }

	            public int getFavorites() {
	                return favorites;
	            }

	            public void setFavorites(int favorites) {
	                this.favorites = favorites;
	            }

	            public int getFollow() {
	                return follow;
	            }

	            public void setFollow(int follow) {
	                this.follow = follow;
	            }

	            public int getIs_published() {
	                return is_published;
	            }

	            public void setIs_published(int is_published) {
	                this.is_published = is_published;
	            }

	            public String getPub_index() {
	                return pub_index;
	            }

	            public void setPub_index(String pub_index) {
	                this.pub_index = pub_index;
	            }

	            public String getPub_time() {
	                return pub_time;
	            }

	            public void setPub_time(String pub_time) {
	                this.pub_time = pub_time;
	            }

	            public int getPub_ts() {
	                return pub_ts;
	            }

	            public void setPub_ts(int pub_ts) {
	                this.pub_ts = pub_ts;
	            }

	            public int getSeason_id() {
	                return season_id;
	            }

	            public void setSeason_id(int season_id) {
	                this.season_id = season_id;
	            }

	            public int getSeason_status() {
	                return season_status;
	            }

	            public void setSeason_status(int season_status) {
	                this.season_status = season_status;
	            }

	            public String getSquare_cover() {
	                return square_cover;
	            }

	            public void setSquare_cover(String square_cover) {
	                this.square_cover = square_cover;
	            }

	            public String getTitle() {
	                return title;
	            }

	            public void setTitle(String title) {
	                this.title = title;
	            }
	        }
	    }
	}
