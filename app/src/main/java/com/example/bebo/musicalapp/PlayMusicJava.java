package com.example.bebo.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayMusicJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playmusic);
        Intent intent = getIntent();
        int position = Integer.parseInt(intent.getStringExtra("name"));
        //List so = (List) intent.getSerializableExtra("name");
        TextView text1 = findViewById(R.id.textView1);

        if (position == 0){
            text1.setText("\n" +
                    "\n" +
                    "أشعياء 55: 7\n" +
                    "\n" +
                    "لِيَتْرُكِ الشِّرِّيرُ طَرِيقَهُ، وَرَجُلُ الإِثْمِ أَفْكَارَهُ، وَلْيَتُبْ إِلَى الرَّبِّ فَيَرْحَمَهُ، وَإِلَى إِلهِنَا لأَنَّهُ يُكْثِرُ الْغُفْرَانَ.\n" +
                    "\n" +
                    "أخبار الأيام الثاني 30: 9\n" +
                    "\n" +
                    "لأَنَّهُ بِرُجُوعِكُمْ إِلَى الرَّبِّ يَجِدُ إِخْوَتُكُمْ وَبَنُوكُمْ رَحْمَةً أَمَامَ الَّذِينَ يَسْبُونَهُمْ، فَيَرْجِعُونَ إِلَى هذِهِ الأَرْضِ، لأَنَّ الرَّبَّ إِلهَكُمْ حَنَّانٌ وَرَحِيمٌ، وَلاَ يُحَوِّلُ وَجْهَهُ عَنْكُمْ إِذَا رَجَعْتُمْ إِلَيْهِ.\n" +
                    "\n" +
                    "المزامير 103: 12\n" +
                    "\n" +
                    "كَبُعْدِ الْمَشْرِقِ مِنَ الْمَغْرِبِ أَبْعَدَ عَنَّا مَعَاصِيَنَا.\n" +
                    "\n" +
                    "1 يوحنا 3: 20\n" +
                    "\n" +
                    "لأَنَّهُ إِنْ لاَمَتْنَا قُلُوبُنَا فَاللهُ أَعْظَمُ مِنْ قُلُوبِنَا، وَيَعْلَمُ كُلَّ شَيْءٍ.\n" +
                    "\n" +
                    "العبرانيين 8: 12\n" +
                    "\n" +
                    "لأَنِّي أَكُونُ صَفُوحًا عَنْ آثَامِهِمْ، وَلاَ أَذْكُرُ خَطَايَاهُمْ وَتَعَدِّيَاتِهِمْ فِي مَا بَعْدُ.\n" +
                    "\n" +
                    "2 كورنثوس 5: 17\n" +
                    "\n" +
                    "إِذًا إِنْ كَانَ أَحَدٌ فِي الْمَسِيحِ فَهُوَ خَلِيقَةٌ جَدِيدَةٌ: الأَشْيَاءُ الْعَتِيقَةُ قَدْ مَضَتْ، هُوَذَا الْكُلُّ قَدْ صَارَ جَدِيدًا.\n" +
                    "\n" +
                    "أرمياء 31: 34\n" +
                    "\n" +
                    "وَلاَ يُعَلِّمُونَ بَعْدُ كُلُّ وَاحِدٍ صَاحِبَهُ، وَكُلُّ وَاحِدٍ أَخَاهُ، قَائِلِينَ: اعْرِفُوا الرَّبَّ، لأَنَّهُمْ كُلَّهُمْ سَيَعْرِفُونَنِي مِنْ صَغِيرِهِمْ إِلَى كَبِيرِهِمْ، يَقُولُ الرَّبُّ، لأَنِّي أَصْفَحُ عَنْ إِثْمِهِمْ، وَلاَ أَذْكُرُ خَطِيَّتَهُمْ بَعْدُ.\n" +
                    "\n" +
                    "1 يوحنا 2: 12\n" +
                    "\n" +
                    "أَكْتُبُ إِلَيْكُمْ أَيُّهَا الأَوْلاَدُ، لأَنَّهُ قَدْ غُفِرَتْ لَكُمُ الْخَطَايَا مِنْ أَجْلِ اسْمِهِ.\n" +
                    "\n" +
                    "1 يوحنا 1: 7\n" +
                    "\n" +
                    "وَلكِنْ إِنْ سَلَكْنَا فِي النُّورِ كَمَا هُوَ فِي النُّورِ، فَلَنَا شَرِكَةٌ بَعْضِنَا مَعَ بَعْضٍ، وَدَمُ يَسُوعَ الْمَسِيحِ ابْنِهِ يُطَهِّرُنَا مِنْ كُلِّ خَطِيَّةٍ.\n");
        }
        else if(position == 1 ){
            text1.setText(".\n" +
                    "\n" +
                    "المزامير ١٤٦: ٨\n" +
                    "\n" +
                    "الرَّبُّ يَفْتَحُ أَعْيُنَ الْعُمْيِ. الرَّبُّ يُقَوِّمُ الْمُنْحَنِينَ. الرَّبُّ يُحِبُّ الصِّدِّيقِينَ.\n" +
                    "\n" +
                    "ناحوم ١: ٧\n" +
                    "\n" +
                    "صَالِحٌ هُوَ الرَّبُّ. حِصْنٌ فِي يَوْمِ الضَّيقِ، وَهُوَ يَعْرِفُ الْمُتَوَكِّلِينَ عَلَيْهِ.\n" +
                    "\n" +
                    "المزامير ٣٧: ٢٤\n" +
                    "\n" +
                    "إِذَا سَقَطَ لاَ يَنْطَرِحُ، لأَنَّ الرَّبَّ مُسْنِدٌ يَدَهُ.\n" +
                    "\n" +
                    "المزامير ٣٢: ٧\n" +
                    "\n" +
                    "أَنْتَ سِتْرٌ لِي. مِنَ الضِّيقِ تَحْفَظُنِي. بِتَرَنُّمِ النَّجَاةِ تَكْتَنِفُنِي. سِلاَهْ.\n" +
                    "\n" +
                    "المزامير ٧١: ٢٠\n" +
                    "\n" +
                    "أَنْتَ الَّذِي أَرَيْتَنَا ضِيقَاتٍ كَثِيرَةً وَرَدِيئَةً، تَعُودُ فَتُحْيِينَا، وَمِنْ أَعْمَاقِ الأَرْضِ تَعُودُ فَتُصْعِدُنَا.\n" +
                    "\n" +
                    "المزامير ٤٢: ١١\n" +
                    "\n" +
                    "لِمَاذَا أَنْتِ مُنْحَنِيَةٌ يَا نَفْسِي؟ وَلِمَاذَا تَئِنِّينَ فِيَّ؟ تَرَجَّيِ اللهَ، لأَنِّي بَعْدُ أَحْمَدُهُ، خَلاَصَ وَجْهِي وَإِلهِي.\n" +
                    "\n" +
                    "المزامير ٧٣: ٢٦\n" +
                    "\n" +
                    "قَدْ فَنِيَ لَحْمِي وَقَلْبِي. صَخْرَةُ قَلْبِي وَنَصِيبِي اللهُ إِلَى الدَّهْرِ.\n" +
                    "\n" +
                    "المزامير ٩١: ١٠- ١١\n" +
                    "\n" +
                    "١٠ لاَ يُلاَقِيكَ شَرٌّ، وَلاَ تَدْنُو ضَرْبَةٌ مِنْ خَيْمَتِكَ. ١١ لأَنَّهُ يُوصِي مَلاَئِكَتَهُ بِكَ لِكَيْ يَحْفَظُوكَ فِي كُلِّ طُرُقِكَ.\n" +
                    "\n" +
                    "المزامير ١٢٦: ٥- ٦\n" +
                    "\n" +
                    "٥ الَّذِينَ يَزْرَعُونَ بِالدُّمُوعِ يَحْصُدُونَ بِالابْتِهَاجِ. ٦ الذَّاهِبُ ذَهَابًا بِالْبُكَاءِ حَامِلاً مِبْذَرَ الزَّرْعِ، مَجِيئًا يَجِيءُ بِالتَّرَنُّمِ حَامِلاً حُزَمَهُ.\n" +
                    "\n" +
                    "المزامير ٣١: ٢٣\n" +
                    "\n" +
                    "أَحِبُّوا الرَّبَّ يَا جَمِيعَ أَتْقِيَائِهِ. الرَّبُّ حَافِظُ الأَمَانَةِ، وَمُجَازٍ بِكَِثْرَةٍ الْعَامِلَ بِالْكِبْرِيَاءِ.\n" +
                    "\n" +
                    "المزامير ٦٨: ١٣\n" +
                    "\n" +
                    "إِذَا اضْطَجَعْتُمْ بَيْنَ الْحَظَائِرِ فَأَجْنِحَةُ حَمَامَةٍ مُغَشَّاةٌ بِفِضَّةٍ وَرِيشُهَا بِصُفْرَةِ الذَّهَبِ».\n" +
                    "\n" +
                    "أيوب ٨: ٢٠- ٢١\n" +
                    "\n" +
                    "٢٠ «هُوَذَا اللهُ لاَ يَرْفُضُ الْكَامِلَ، وَلاَ يَأْخُذُ بِيَدِ فَاعِلِي الشَّرِّ. ٢١ عِنْدَمَا يَمْلأُ فَاكَ ضِحْكًا، وَشَفَتَيْكَ هُتَافًا،\n" +
                    "\n" +
                    "المزامير ٢٢: ٢٤\n" +
                    "\n" +
                    "لأَنَّهُ لَمْ يَحْتَقِرْ وَلَمْ يُرْذِلْ مَسْكَنَةَ الْمَِسْكِينِ، وَلَمْ يَحْجُبْ وَجْهَهُ عَنْهُ، بَلْ عِنْدَ صُرَاخِهِ إِلَيْهِ اسْتَمَعَ.\n" +
                    "\n" +
                    "أيوب ٥: ١٩\n" +
                    "\n" +
                    "فِي سِتِّ شَدَائِدَ يُنَجِّيكَ، وَفِي سَبْعٍ لاَ يَمَسُّكَ سُوءٌ.\n" +
                    "\n" +
                    "المزامير ٩: ٩\n" +
                    "\n" +
                    "وَيَكُونُ الرَّبُّ مَلْجَأً لِلْمُنْسَحِقِ. مَلْجَأً فِي أَزْمِنَةِ الضِّيقِ.\n" +
                    "\n" +
                    "المزامير ١٣٨: ٧\n" +
                    "\n" +
                    "إِنْ سَلَكْتُ فِي وَسَطِ الضِّيْقِ تُحْيِنِي. عَلَى غَضَبِ أَعْدَائِي تَمُدُّ يَدَكَ، وَتُخَلِّصُنِي يَمِينُكَ.\n" +
                    "\n" +
                    "المزامير ١٨: ٢٨\n" +
                    "\n" +
                    "لأَنَّكَ أَنْتَ تُضِيءُ سِرَاجِي. الرَّبُّ إِلهِي يُنِيرُ ظُلْمَتِي.\n" +
                    "\n" +
                    "المزامير ٣٤: ١٩\n" +
                    "\n" +
                    "كَثِيرَةٌ هِيَ بَلاَيَا الصِّدِّيقِ، وَمِنْ جَمِيعِهَا يُنَجِّيهِ الرَّبُّ.\n" +
                    "\n" +
                    "مراثي أرمياء ٣: ٣١- ٣٣\n" +
                    "\n" +
                    "٣١ لأَنَّ السَّيِّدَ لاَ يَرْفُضُ إِلَى الأَبَدِ. ٣٢ فَإِنَّهُ وَلَوْ أَحْزَنَ يَرْحَمُ حَسَبَ كَثْرَةِ مَرَاحِمِهِ. ٣٣ لأَنَّهُ لاَ يُذِلُّ مِنْ قَلْبِهِ، وَلاَ يُحْزِنُ بَنِي الإِنْسَانِ.\n" +
                    "\n" +
                    "المزامير ١٨: ٢\n" +
                    "\n" +
                    "الرَّبُّ صَخْرَتِي وَحِصْنِي وَمُنْقِذِي. إِلهِي صَخْرَتِي بِهِ أَحْتَمِي. تُرْسِي وَقَرْنُ خَلاَصِي وَمَلْجَإِي.\n" +
                    "\n" +
                    "ميخا ٧: ٨- ٩\n" +
                    "\n" +
                    "٨ لاَ تَشْمَتِي بِي يَا عَدُوَّتِي، إِذَا سَقَطْتُ أَقُومُ. إِذَا جَلَسْتُ فِي الظُّلْمَةِ فَالرَّبُّ نُورٌ لِي. ٩ أَحْتَمِلُ غَضَبَ الرَّبِّ لأَنِّي أَخْطَأْتُ إِلَيْهِ، حَتَّى يُقِيمَ دَعْوَايَ وَيُجْرِيَ حَقِّي. سَيُخْرِجُنِي إِلَى النُّورِ، سَأَنْظُرُ بِرَّهُ.\n" +
                    "\n" +
                    "يوحنا ١٦: ٣٣\n" +
                    "\n" +
                    "قَدْ كَلَّمْتُكُمْ بِهذَا لِيَكُونَ لَكُمْ فِيَّ سَلاَمٌ. فِي الْعَالَمِ سَيَكُونُ لَكُمْ ضِيقٌ، وَلكِنْ ثِقُوا: أَنَا قَدْ غَلَبْتُ الْعَالَمَ».\n");
        }
        else if(position == 2 ){
            text1.setText(".\n" +
                    "\n" +
                    "مرقس 11: 22-23\n" +
                    "\n" +
                    "22 فَأَجَابَ يَسُوعُ وَقَالَ لَهُمْ :«لِيَكُنْ لَكُمْ إِيمَانٌ بِاللهِ. 23 لأَنِّي الْحَقَّ أَقُولُ لَكُمْ: إِنَّ مَنْ قَالَ لِهذَا الْجَبَلِ: انْتَقِلْ وَانْطَرِحْ فِي الْبَحْرِ! وَلاَ يَشُكُّ فِي قَلْبِهِ، بَلْ يُؤْمِنُ أَنَّ مَا يَقُولُهُ يَكُونُ، فَمَهْمَا قَالَ يَكُونُ لَهُ.\n" +
                    "\n" +
                    "يوحنا 1: 12\n" +
                    "\n" +
                    "وَأَمَّا كُلُّ الَّذِينَ قَبِلُوهُ فَأَعْطَاهُمْ سُلْطَانًا أَنْ يَصِيرُوا أَوْلاَدَ اللهِ، أَيِ الْمُؤْمِنُونَ بِاسْمِهِ.\n" +
                    "\n" +
                    "يوحنا 3: 36\n" +
                    "\n" +
                    "الَّذِي يُؤْمِنُ بِالابْنِ لَهُ حَيَاةٌ أَبَدِيَّةٌ، وَالَّذِي لاَ يُؤْمِنُ بِالابْنِ لَنْ يَرَى حَيَاةً بَلْ يَمْكُثُ عَلَيْهِ غَضَبُ اللهِ».\n" +
                    "\n" +
                    "يوحنا 20: 29\n" +
                    "\n" +
                    "قَالَ لَهُ يَسُوعُ:«لأَنَّكَ رَأَيْتَنِي يَا تُومَا آمَنْتَ! طُوبَى لِلَّذِينَ آمَنُوا وَلَمْ يَرَوْا».\n" +
                    "\n" +
                    "أعمال الرسل 10: 43\n" +
                    "\n" +
                    "لَهُ يَشْهَدُ جَمِيعُ الأَنْبِيَاءِ أَنَّ كُلَّ مَنْ يُؤْمِنُ بِهِ يَنَالُ بِاسْمِهِ غُفْرَانَ الْخَطَايَا».\n" +
                    "\n" +
                    "أعمال الرسل 16: 31\n" +
                    "\n" +
                    "فَقَالاَ:«آمِنْ بِالرَّبِّ يَسُوعَ الْمَسِيحِ فَتَخْلُصَ أَنْتَ وَأَهْلُ بَيْتِكَ».\n" +
                    "\n" +
                    "1 كورنثوس 16: 13\n" +
                    "\n" +
                    "اِسْهَرُوا. اثْبُتُوا فِي الإِيمَانِ. كُونُوا رِجَالاً. تَقَوَّوْا.\n" +
                    "\n" +
                    "2 كورنثوس 5: 7\n" +
                    "\n" +
                    "لأَنَّنَا بِالإِيمَانِ نَسْلُكُ لاَ بِالْعِيَانِ.\n" +
                    "\n" +
                    "غلاطية 5: 22-23\n" +
                    "\n" +
                    "22 وَأَمَّا ثَمَرُ الرُّوحِ فَهُوَ: مَحَبَّةٌ فَرَحٌ سَلاَمٌ، طُولُ أَنَاةٍ لُطْفٌ صَلاَحٌ، إِيمَانٌ 23 وَدَاعَةٌ تَعَفُّفٌ. ضِدَّ أَمْثَالِ هذِهِ لَيْسَ نَامُوسٌ.\n" +
                    "\n" +
                    "غلاطية 2: 20\n" +
                    "\n" +
                    "مَعَ الْمَسِيحِ صُلِبْتُ، فَأَحْيَا لاَ أَنَا، بَلِ الْمَسِيحُ يَحْيَا فِيَّ. فَمَا أَحْيَاهُ الآنَ فِي الْجَسَدِ، فَإِنَّمَا أَحْيَاهُ فِي الإِيمَانِ، إِيمَانِ ابْنِ اللهِ، الَّذِي أَحَبَّنِي وَأَسْلَمَ نَفْسَهُ لأَجْلِي.\n" +
                    "\n" +
                    "غلاطية 3: 26\n" +
                    "\n" +
                    "لأَنَّكُمْ جَمِيعًا أَبْنَاءُ اللهِ بِالإِيمَانِ بِالْمَسِيحِ يَسُوعَ.\n" +
                    "\n" +
                    "أفسس 2: 8\n" +
                    "\n" +
                    "لأَنَّكُمْ بِالنِّعْمَةِ مُخَلَّصُونَ، بِالإِيمَانِ، وَذلِكَ لَيْسَ مِنْكُمْ. هُوَ عَطِيَّةُ اللهِ.\n" +
                    "\n" +
                    "أفسس 3: 17-19\n" +
                    "\n" +
                    "17 لِيَحِلَّ الْمَسِيحُ بِالإِيمَانِ فِي قُلُوبِكُمْ، 18 وَأَنْتُمْ مُتَأَصِّلُونَ وَمُتَأَسِّسُونَ فِي الْمَحَبَّةِ، حَتَّى تَسْتَطِيعُوا أَنْ تُدْرِكُوا مَعَ جَمِيعِ الْقِدِّيسِينَ، مَا هُوَ الْعَرْضُ وَالطُّولُ وَالْعُمْقُ وَالْعُلْوُ، 19 وَتَعْرِفُوا مَحَبَّةَ الْمَسِيحِ الْفَائِقَةَ الْمَعْرِفَةِ، لِكَيْ تَمْتَلِئُوا إِلَى كُلِّ مِلْءِ اللهِ.\n" +
                    "\n" +
                    "كولوسي 2: 6-7\n" +
                    "\n" +
                    "6 فَكَمَا قَبِلْتُمُ الْمَسِيحَ يَسُوعَ الرَّبَّ اسْلُكُوا فِيهِ، 7 مُتَأَصِّلِينَ وَمَبْنِيِّينَ فِيهِ، وَمُوَطَّدِينَ فِي الإِيمَانِ، كَمَا عُلِّمْتُمْ، مُتَفَاضِلِينَ فِيهِ بِالشُّكْرِ.\n" +
                    "\n" +
                    "يعقوب 1: 5-6\n" +
                    "\n" +
                    "5 وَإِنَّمَا إِنْ كَانَ أَحَدُكُمْ تُعْوِزُهُ حِكْمَةٌ، فَلْيَطْلُبْ مِنَ اللهِ الَّذِي يُعْطِي الْجَمِيعَ بِسَخَاءٍ وَلاَ يُعَيِّرُ، فَسَيُعْطَى لَهُ. 6 وَلكِنْ لِيَطْلُبْ بِإِيمَانٍ غَيْرَ مُرْتَابٍ الْبَتَّةَ، لأَنَّ الْمُرْتَابَ يُشْبِهُ مَوْجًا مِنَ الْبَحْرِ تَخْبِطُهُ الرِّيحُ وَتَدْفَعُهُ.\n" +
                    "\n" +
                    "1 بطرس 2: 6\n" +
                    "\n" +
                    "لِذلِكَ يُتَضَمَّنُ أَيْضًا فِي الْكِتَابِ:«هنَذَا أَضَعُ فِي صِهْيَوْنَ حَجَرَ زَاوِيَةٍ مُخْتَارًا كَرِيمًا، وَالَّذِي يُؤْمِنُ بِهِ لَنْ يُخْزَى».\n" +
                    "\n" +
                    "العبرانيين 11: 1\n" +
                    "\n" +
                    "وَأَمَّا الإِيمَانُ فَهُوَ الثِّقَةُ بِمَا يُرْجَى وَالإِيقَانُ بِأُمُورٍ لاَ تُرَى.\n" +
                    "\n" +
                    "العبرانيين 11: 6\n" +
                    "\n" +
                    "وَلكِنْ بِدُونِ إِيمَانٍ لاَ يُمْكِنُ إِرْضَاؤُهُ، لأَنَّهُ يَجِبُ أَنَّ الَّذِي يَأْتِي إِلَى اللهِ يُؤْمِنُ بِأَنَّهُ مَوْجُودٌ، وَأَنَّهُ يُجَازِي الَّذِينَ يَطْلُبُونَهُ.\n" +
                    "\n" +
                    "العبرانيين 12: 1-2\n" +
                    "\n" +
                    "1 لِذلِكَ نَحْنُ أَيْضًا إِذْ لَنَا سَحَابَةٌ مِنَ الشُّهُودِ مِقْدَارُ هذِهِ مُحِيطَةٌ بِنَا، لِنَطْرَحْ كُلَّ ثِقْل، وَالْخَطِيَّةَ الْمُحِيطَةَ بِنَا بِسُهُولَةٍ، وَلْنُحَاضِرْ بِالصَّبْرِ فِي الْجِهَادِ الْمَوْضُوعِ أَمَامَنَا، 2 نَاظِرِينَ إِلَى رَئِيسِ الإِيمَانِ وَمُكَمِّلِهِ يَسُوعَ، الَّذِي مِنْ أَجْلِ السُّرُورِ الْمَوْضُوعِ أَمَامَهُ، احْتَمَلَ الصَّلِيبَ مُسْتَهِينًا بِالْخِزْيِ، فَجَلَسَ فِي يَمِينِ عَرْشِ اللهِ.\n" +
                    "\n" +
                    "2 تيموثاوس 3: 14-15\n" +
                    "\n" +
                    "14 وَأَمَّا أَنْتَ فَاثْبُتْ عَلَى مَا تَعَلَّمْتَ وَأَيْقَنْتَ، عَارِفًا مِمَّنْ تَعَلَّمْتَ. 15 وَأَنَّكَ مُنْذُ الطُّفُولِيَّةِ تَعْرِفُ الْكُتُبَ الْمُقَدَّسَةَ، الْقَادِرَةَ أَنْ تُحَكِّمَكَ لِلْخَلاَصِ، بِالإِيمَانِ الَّذِي فِي الْمَسِيحِ يَسُوعَ.\n");
        }
        else if (position == 3){
            text1.setText("لاَ تَخَفْ، أَيُّهَا الْقَطِيعُ الصَّغِيرُ، لأَنَّ أَبَاكُمْ قَدْ سُرَّ أَنْ يُعْطِيَكُمُ الْمَلَكُوتَ.\nلوقا ١٢: ٣٢\n" +
                    "\n" +
                    "«لاَ تَخَفْ، أَيُّهَا الْقَطِيعُ الصَّغِيرُ، لأَنَّ أَبَاكُمْ قَدْ سُرَّ أَنْ يُعْطِيَكُمُ الْمَلَكُوتَ.\n" +
                    "\n" +
                    "أشعياء ٤١: ١٣\n" +
                    "\n" +
                    "لأَنِّي أَنَا الرَّبُّ إِلهُكَ الْمُمْسِكُ بِيَمِينِكَ، الْقَائِلُ لَكَ: لاَ تَخَفْ. أَنَا أُعِينُكَ.\n" +
                    "\n" +
                    "الأمثال ١: ٣٣\n" +
                    "\n" +
                    "أَمَّا الْمُسْتَمِعُ لِي فَيَسْكُنُ آمِنًا، وَيَسْتَرِيحُ مِنْ خَوْفِ الشَّرِّ».\n" +
                    "\n" +
                    "متى ١٠: ٢٨\n" +
                    "\n" +
                    "وَلاَ تَخَافُوا مِنَ الَّذِينَ يَقْتُلُونَ الْجَسَدَ وَلكِنَّ النَّفْسَ لاَ يَقْدِرُونَ أَنْ يَقْتُلُوهَا، بَلْ خَافُوا بِالْحَرِيِّ مِنَ الَّذِي يَقْدِرُ أَنْ يُهْلِكَ النَّفْسَ وَالْجَسَدَ كِلَيْهِمَا فِي جَهَنَّمَ.\n" +
                    "\n" +
                    "الأمثال ٣: ٢٥- ٢٦\n" +
                    "\n" +
                    "٢٥ لاَ تَخْشَى مِنْ خَوْفٍ بَاغِتٍ، وَلاَ مِنْ خَرَابِ الأَشْرَارِ إِذَا جَاءَ. ٢٦ لأَنَّ الرَّبَّ يَكُونُ مُعْتَمَدَكَ، وَيَصُونُ رِجْلَكَ مِنْ أَنْ تُؤْخَذَ.\n" +
                    "\n" +
                    "2 تيموثاوس ١: ٧\n" +
                    "\n" +
                    "لأَنَّ اللهَ لَمْ يُعْطِنَا رُوحَ الْفَشَلِ، بَلْ رُوحَ الْقُوَّةِ وَالْمَحَبَّةِ وَالنُّصْحِ.\n" +
                    "\n" +
                    "أشعياء ١٤: ٣\n" +
                    "\n" +
                    "وَيَكُونُ فِي يَوْمٍ يُرِيحُكَ الرَّبُّ مِنْ تَعَبِكَ وَمِنِ انْزِعَاجِكَ، وَمِنَ الْعُبُودِيَّةِ الْقَاسِيَةِ الَّتِي اسْتُعْبِدْتَ بِهَا،\n" +
                    "\n" +
                    "الأمثال ٣: ٢٤\n" +
                    "\n" +
                    "إِذَا اضْطَجَعْتَ فَلاَ تَخَافُ، بَلْ تَضْطَجعُ وَيَلُذُّ نَوْمُكَ.\n" +
                    "\n" +
                    "1 بطرس ٣: ١٢- ١٤\n" +
                    "\n" +
                    "١٢ لأَنَّ عَيْنَيِ الرَّبِّ عَلَى الأَبْرَارِ، وَأُذْنَيْهِ إِلَى طَلِبَتِهِمْ، وَلكِنَّ وَجْهَ الرَّبِّ ضِدُّ فَاعِلِي الشَّرِّ». ١٣ فَمَنْ يُؤْذِيكُمْ إِنْ كُنْتُمْ مُتَمَثِّلِينَ بِالْخَيْرِ؟ ١٤ وَلكِنْ وَإِنْ تَأَلَّمْتُمْ مِنْ أَجْلِ الْبِرِّ، فَطُوبَاكُمْ. وَأَمَّا خَوْفَهُمْ فَلاَ تَخَافُوهُ وَلاَ تَضْطَرِبُوا،\n" +
                    "\n" +
                    "أشعياء ٥٤: ١٤\n" +
                    "\n" +
                    "بِالْبِرِّ تُثَبَّتِينَ بَعِيدَةً عَنِ الظُّلْمِ فَلاَ تَخَافِينَ، وَعَنِ الارْتِعَابِ فَلاَ يَدْنُو مِنْكِ.\n" +
                    "\n" +
                    "رومية ٨: ١٥\n" +
                    "\n" +
                    "إِذْ لَمْ تَأْخُذُوا رُوحَ الْعُبُودِيَّةِ أَيْضًا لِلْخَوْفِ، بَلْ أَخَذْتُمْ رُوحَ التَّبَنِّي الَّذِي بِهِ نَصْرُخُ:«يَا أَبَا الآبُ».\n" +
                    "\n" +
                    "العبرانيين ١٣: ٦\n" +
                    "\n" +
                    "حَتَّى إِنَّنَا نَقُولُ وَاثِقِينَ:«الرَّبُّ مُعِينٌ لِي فَلاَ أَخَافُ. مَاذَا يَصْنَعُ بِي إِنْسَانٌ؟»\n" +
                    "\n" +
                    "المزامير ٥١: ١٢\n" +
                    "\n" +
                    "رُدَّ لِي بَهْجَةَ خَلاَصِكَ، وَبِرُوحٍ مُنْتَدِبَةٍ اعْضُدْنِي.\n" +
                    "\n" +
                    "أشعياء ٥١: ١٢\n" +
                    "\n" +
                    "«أَنَا أَنَا هُوَ مُعَزِّيكُمْ. مَنْ أَنْتِ حَتَّى تَخَافِي مِنْ إِنْسَانٍ يَمُوتُ، وَمِنِ ابْنِ الإِنْسَانِ الَّذِي يُجْعَلُ كَالْعُشْبِ؟\n" +
                    "\n" +
                    "المزامير ٩١: ٤- ٦\n" +
                    "\n" +
                    "٤ بِخَوَافِيهِ يُظَلِّلُكَ، وَتَحْتَ أَجْنِحَتِهِ تَحْتَمِي. تُرْسٌ وَمِجَنٌّ حَقُّهُ. ٥ لاَ تَخْشَى مِنْ خَوْفِ اللَّيْلِ، وَلاَ مِنْ سَهْمٍ يَطِيرُ فِي النَّهَارِ، ٦ وَلاَ مِنْ وَبَإٍ يَسْلُكُ فِي الدُّجَى، وَلاَ مِنْ هَلاَكٍ يُفْسِدُ فِي الظَّهِيرَةِ.\n" +
                    "\n" +
                    "أشعياء ٥٤: ٤\n");

        }
        else if(position == 1 ){
            text1.setText("");
        }

        final Button button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(PlayMusicJava.this, ListMusicJava.class);
                startActivity(in);
            }
        });
    }
}