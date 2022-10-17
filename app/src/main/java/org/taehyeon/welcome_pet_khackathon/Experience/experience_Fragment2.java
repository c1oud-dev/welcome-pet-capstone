package org.taehyeon.welcome_pet_khackathon.Experience;

import android.os.Bundle;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.taehyeon.welcome_pet_khackathon.MainActivity;
import org.taehyeon.welcome_pet_khackathon.R;


public class experience_Fragment2 extends Fragment  implements OnBackPressedListener{ //

    private View view;
    private TextView textView_exp;
    private TextView textView;
    private String name;
    private int num;
    Button button_ar;
    Button button_exp;
    MainActivity activity;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        view = inflater.inflate(R.layout.fragment_experience_2, container, false);
        textView_exp = view.findViewById(R.id.textView_exp);

        button_ar = view.findViewById(R.id.button_info_ar);
        button_exp = view.findViewById(R.id.button_exp);
        textView = view.findViewById(R.id.textView_experience);

        if(getArguments()!=null)
        {
            name = getArguments().getString("name");
            //num = getArguments().getInt("index");
            textView_exp.setText(name);
            Experience_Index(name);
            //Toast.makeText(getContext(),num+"값이 넘어옴", Toast.LENGTH_SHORT).show();
        }

        return view;
    }


    // 각 문제마다 인덱스 넘겨받아서 버튼 이벤트 다르게 띄우기
    public String Experience_Index(String title) {
        switch (title)
        {
            case "반려견이 짖는 이유와 개선 방법":
                button_ar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(),"AR 화면으로 이동합니다.",Toast.LENGTH_SHORT).show();

                    }
                });
                button_exp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Toast.makeText(getContext(),num+"번째 설명 바로 보기",Toast.LENGTH_SHORT).show();
                        textView.setText("<강아지가 짖는 이유는 무엇일까요?>\n" +
                                "1. 경계성 짖음 \n: 외부소리나 낯선사람을 보고 짖는 행동들이 많이 나타난다. 사회성 부족에 의해서 누군가의 접근이나 특정소리에 불안함을 느끼게 되면서 자신이 짖는 것으로 경고를 주지 않는다면 사라지지 않는다고 학습하여 방어적, 경성으로 짖게 되는 것이다. 이러한 경고가 통하지 않는다면 이후에는 공격성으로도 발전하게 된다.\n" +
                                "\n2. 불안성 짖음 \n: 불안성 짖음 또한 사회성이 부족할 때 그리고 보호자분에게 의존도가 높을 경우 발생되는 문제 중 하나이다. 급격한 환경 변화, 보호자분의 생활 패턴 변화, 낯선 환경 등이 발생하게 되었을 때 스스로 적응하지 못하고 보호자분에게만 의존하여 해결하려는 모습을 보이게 된다. 이 때문에 안정을 심어줄 수 있는 보호자가 사라진다면 그때부터 불안해서 짖거나 하울링을 그 밖에도 배변실수나 스트레스 행동을 보이며 강아지가 짖는 이유가 될 수 있다.\n" +
                                "\n3. 요구성 짖음 \n: 보호자분에게 요구사항을 낑낑거리거나 짖는 것으로 표현했을 때 이것을 해결해준다면 학습하게 되어 원하는 것이 있을때나 보호자분이 필요할 때 그리고 흥분해서 재촉을 할 때 요구적 표현으로 강아지가 짖는 이유가 된다. 초기에는 큰 불편함이 없지만 적절하게 대처해주지 못한다면 늦은 밤이나 조용해야 할 공간에서도 이러한 표현을 하여 많은 불편함을 만들게 된다.\n" +
                                "\n" +
                                "<강아지 짖음방지기를 꼭 써야 할까요?>\n" +
                                "‘짖음’은 주변 이웃들과 보호자에게도 많은 불편함을 유발하기 때문에 짖음해결이 제대로 되지 않는다면 강아지 짖음 방지기를 고민하고 계신 경우가 많다. 강아지 짖음방지기 종류로는 초음파 소리, 싫어하는 냄새 스프레이, 전기 충격지 등 다양한 방법이 있지만 이러한 제품들의 원리는 동일하게 짖을 때마다 목걸이에서 이것을 감지하고 짖지 못하도록 불편한 자극을 주는 원리로 우리가 단순하게 강아게 혼내는 것과 다르지 않다. 강아지가 짖을 때 우리가 직접적으로 혼내지 않고 더 강한 자극을 주는 것 뿐이지 반려견의 근본적인 불편함을 개선해주는 도구는 절대로 아니다. 그렇다보니 이러한 도구를 이용해서 단순하게 짖을 막는 것은 좋은 방법이 아니라고 말씀드리고 싶다. 더군다가 짖음방지기 사용은 여러 부작용도 발생시킬 수 있다보니 사용하지 않는 것을 권장한다.\n" +
                                "\n" +
                                "<그렇다면 강아지 짖는 문제 어떻게 해결해야 할까요?>\n" +
                                "1. 특정 소리, 대상을 보고 짖는 때 \n: 사회성 부족에 의한 과도한 경계심으로 강아지가 짖는 것이기에 특정 대상, 소리에 대한 불안감을 해소시켜주는 것이 중요하다. 특정 소리에 짖음이 심하다면 반복적으로 들려주며 둔감화 시켜주고 이때 간식을 주변에 던져주거나 놀아주면서 자연스레 소리에 신경쓰지 않도록 해주는 것도 좋은 방법이 된다.\n" +
                                "\n2. 혼자 있을 때 불안해 한다면?\n 보호자분을 따라다니고 집착이 심하다면 함께 있는 시간에서부터 독립심을 길러주기 위해 “기다려” 교육을 시켜서 따라다니지 않도록 해줘야 한다. 또한 교육기간 동안에는 최대한 관심을 줄여주고 보호자와 함께 자거나 품에 안겨서 휴식을 취하는 것도 거절해야 한다. 외출 전 산택을 통해서 에너지 소비를 해주고 나갈 때 사료과 간식을 챙겨주면서 혼자 있을 때 좋은 인식도 심어주는 것도 외출 후 강아지 짖는 문제를 해결하는데 도움이 된다.\n" +
                                "\n3. 요구성 짖음이 심할 때 \n: 원하는 것을 요구적으로 짖어서 표현할 때 최대한 관심을 갖지 않아야 한다. 우리가 “안돼!”라고 말해도 소용이 없다면 이 또한 긍정적인 반응으로 생각하는 것으로 무관심 속에도 계속 짖는다면 다른 장소로 이동해주는 것도 좋다. 잘못된 표현을 했을 때 반대로 반려견을 잠시 방에 넣어둬서 예상했던 결과와 다르게 나타난다는 것을 학습시켜주는 것도 좋은 방법이다.\n" +
                                "\n" +
                                "- 동물 행동 전문가 최*호 훈련사 -\n"+
                                "\n" +
                                "\n");
                    }
                });
                break;

            case "반려견이 아플 때 보이는 행동":
                button_ar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(),"AR 화면으로 이동합니다.",Toast.LENGTH_SHORT).show();
                    }
                });
                button_exp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText("강아지는 아파도 아프다고 말을 할 수가 없다. 대신 강아지의 평소 행동 변화를 통해 건상상태를 추측해볼 수 있다.\n" +
                                "\n" +
                                "<강아지 아플 때 보이는 행동>\n" +
                                "1. 무기력하게 엎드려 있다.\n" +
                                ": 평소와 달리 기운이 쭉 빠져 있고 좋아하는 음식이나 장난감에도 반응이 없다면 몸 상태가 안 좋거나 또는 다쳤을 가능성이 있다. 병원에 내원하여 컨디션 변화에 대해 꼼꼼하게 말씀드리는게 도움이 된다.\n" +
                                "\n2. 불러도 반응이 거의 없다.\n" +
                                ": 딱히 아파 보이진 않는데 보호자가 불렀을 때 심드렁한 반응을 보일 때가 있다. 무리하게 놀았다거나 스트레스를 많이 받았을 경우 혹은 피곤할 때 이런 반응을 보인다. 이럴 때는 푹 쉬게 한 다음에 다시 기운을 차리는지 살펴보아야 한다.\n" +
                                "\n3. 몸을 만졌을 때 싫어한다.\n" +
                                ": 몸의 한 부위를 만졌을 때 싫어하거나 혹은 머리를 아래로 떨구고 걸어 다닌다면 통증이나 불편함이 있다고 볼 수 있다. 먼저 외상이 있는지 체크한 후, 병원에 데려가야 한다.\n" +
                                "\n4. 식욕이 없다.\n" +
                                ":　평소와 달리 식용이 없으면 단순히 기분이 안 좋을 수도 있고, 먹고 싶은 음식이 따로 있어서 사료를 거부하는 걸 수도 있다. 하지만 이 증상이 지속적으로 이어진다면 질병을 의심해볼 수 있다.\n" +
                                "\n5. 구토를 한다.\n" +
                                ": 밥을 안 먹었는데도 위액을 토한다거나, 밥을 먹고 나서 토를 한 뒤, 그 토를 다시 먹으려는 행동을 할 때는 크게 걱정할 필요는 없다. 하지만 배변 등 다른 이상 증세가 있다면 며칠 정도 지켜봐야 한다. 계속해서 기운이 없고 구토를 하거나, 토사물에 보호자가 주지 않은 음식이 섞여 있거나, 피가 섞인 토나 갈색 토를 했을 때는 바로 병원에 데려가는게 좋다.\n" +
                                "\n6. 설사를 한다.\n" +
                                ": 부패한 음식을 먹었거나 과식을 했을 때도 설사를 할 수 있다. 설사 증상 외에 다른 것은 다 건강하다면 하루 정도 식사를 주지 말고 지켜봐야 한다. 그 후 회복된다면 괜찮지만, 계속해서 기운이 없고 식욕도 없다면 진찰을 받아볼 필요가 있다. 특히, 설사에 피가 섞여 있으면 바로 병원에 데려가야한다.\n" +
                                "\n7. 움직임이 평소와 다르다.\n" +
                                ": 평상시와 다르게 걷는 등 움직임이 이상하다면 외상이나 통증이 없는지 손으로 만져보길 바란다. 그 외에도 관절이나 뼈에 이상이 생겼을 가능성도 있으므로 병원에서 검진을 받아보는게 좋다.\n" +
                                "\n8. 털과 피부가 변했다.\n" +
                                ": 몸을 자주 긁는다던지 피부가 빨갛게 변했다던지 탈모가 생겼다던지 등의 피부와 털의 이상 증상이 나타났다면 병원에서 진료를 받아야 한다.\n" +
                                "\n9. 눈이 이상하다.\n" +
                                ": 눈곱이 많이 꼈거나, 눈 색깔이 변했거나, 눈에서 이상한 냄새가 난다면 염증 때문일 수 있다. 병원에 내원하여 진료를 받아야 한다.\n" +
                                "\n- 이*동물의료센터 이*흔 원장-\n"+
                                "\n" +
                                "\n");
                    }
                });
                break;

            case "강아지가 무는 다양한 이유, 입질과 대처법":
                button_ar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(),"AR 화면으로 이동합니다.",Toast.LENGTH_SHORT).show();
                    }
                });
                button_exp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText("<강아지가 무는 이유>\n" +
                                "1. 강아지 입질 (2~4개월 시기)\n\n" +
                                "  - 호기심 : 이 시기에는 세상 모든 것이 너무 궁금하고 신기해서 호기심에 일단 입에 넣고 빨고 씹어본다. 단순한 궁금증이며 입에 넣고 몇 번 씹어 보니까 맛이 있으면 계속 씹고, 맛이 없으면 퉤 하고 내뱉기도 한다. 이 시기에 중요한 것은 먹어도 되는 것과 그러면 안되는 것을 구분시켜 줘야 한다. \n" +
                                "\n  - 심심함, 관심 필요 : ‘놀자’는 표현으로 보호자의 손과 발, 양말 등을 깨물며 달려든다. 처음에는 귀엽기도 해서 놀아주지만 그 강도가 점점 세지면서 아파오기 시작한다면 ‘아!’라고 소리를 내거나 무시하는 척 등 강아지에게 거절표현을 하여 충분히 알아들을 수 있도록 해야 한다. 그리고 공이나, 인형, 장난감으로 놀아주면서 흥미를 옮겨주면 된다.\n" +
                                "\n" +
                                "2. 강아지 입질 (4~8개월 시기)\n" +
                                " - 이갈이 시기 입질 : 이때는 이갈이 시기로 이가 간질간질해서 본격적으로 더 물어뜯으려고 한다. 이갈이는 보통 4~5개월에 시작해서 8개월 정도면 유치가 다 빠지고 영구치가 자란다. 이 기간은 무엇이든지 물어뜯고 잘근잘근 씹으면서 이 간질함을 해소하려고 한다. 플라스틱, 소화가 안되는 고무 이런 것 보다 우드스틱과 뼈간식 같은 씹어도 안전한 것을 주어 해소시켜 주면 좋다.\n" +
                                "\n" +
                                "3. 강아지 공격성\n" +
                                " - 싫어하는 행동을 할 때 의사표현 : 주로 발톱을 깎거나, 빗질을 하거나 목욕을 할 때 싫다는 표현으로 입질을 한다. 그런데 보호자가 하면 물고, 미용실에 맡기거나 훈련소에 가면 입질을 안하는 경우가 있는데 이것은 바로 ‘주도권’ 때문이다. 이 주도권이 의미는 보호자와 강아지 사이에서 강아지가 대표성을 띄고 있으며 자신이 우위에 있다고 생각하기 때문이다. 내가 더 위에 있고, 모든 행동을 통제하고 주도권을 가지고 있는데 나보다 서열이 아래인 개체가 예민한 부위를 만지고 싫어하는 행동을 하게 되면 무는 것이다. 하지만 미용사나 훈련사는 애초에 주도권을 가진 대상이 아니므로 더 얌전하고 참을 수 밖에 없는 것이다.\n" +
                                "\n - 다른 강아지와 다른 사람에 대한 입질 : 집 안에 들어오는 외부인, 밖에서 만나는 강아지를 보고 마치 악령에 씌인 듯 짖으면서 공격하려는 강아지도 있다. 그 이유는 무섭고, 두려워서, 불안해서 방어 본능으로 행동하게 되는 것이다. 보호자님과 가족 구성원 이외의 다른 누군가가 내 영역을 침범하면서 자신의 몸을 지키기 위해 먼저 공격하는 것이다. 강아지는 ‘개’라는 동물이며 어느정도 야생성과 본능이 있다. 자신이 안전하다고 느끼고, 편안하다고 생각해야 집 안에서도 편안히 잘 지내는데 여기서 안점함과 편안함을 느끼지 못하면 스스로 그 안전함을 쟁취하기 위해 열심히 외부자극과 외부인, 다른 강아지를 향해 짖고 달려들며 공격을 하는 것이다. 이렇게 격하게 표현하면 상대방은 겁을 먹고 움추러 들거나, 도망치는 등 상황이 해결되다보니 반복해서 이런 식으로 표현하게 되는 것이다.\n" +
                                "\n" +
                                "\n<대처법>\n" +
                                "▶ 집 안에서의 생활 습관부터 바꾸자!\n" +
                                "  우리가 알게 모르게 주도권을 주고 있던 행동들이 있다. 보통 자율급식과 무분별하고 의미없는 스킨쉽, 강아지 위주의 생활, 규칙없는 산책, 보호자와 함께 잠자기 등이 있다. 보호자가 주도해서 모든 것을 관리하고 행한다고 생각하면 편할 것이다.\n" +
                                "\n▶ 회피하지 말고 해결하자!\n" +
                                "  보통 보호자분들은 다른 강아지나 사람을 보고 짖을 때 안아올려서 몸을 돌리시는 경우가 많다. 이 방법은 그 상황을 회피하는 방법이지 해결하는 방법이 아니다. 오히려 강아지를 안아주면서 스킨쉽이 자연스럽게 들어가는데 짖는 것이 보상이 되고 보호자 품 안에 있으니 든든하게 생각해 더 강하게 짖고 으르렁 거리게 된다. 먼저, 산책 도구부터 바꿔주는 것이 좋다. 목줄 길이 제한 리드줄로 바꿔주시고 만약 다른 강아지나 사람을 보고 짖으려고 달려간다면 줄 짧게 잡고 블로킹을 하면서 무조건 그 행동을 멈춰주시고 주도권을 빼앗아 줘야 한다.\n" +
                                "\n" +
                                "- 동물 행동 전문가 고*성 훈련사 -\n"+
                                "\n"+
                                "\n");
                    }
                });
                break;
            case "배변 실수하는 원인과 교육 방법":
                button_ar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(),"상위 3개의 정보 버튼만 활성화 되어있습니다. 3개 중 1개를 선택하세요.",Toast.LENGTH_SHORT).show();
                    }
                });
                button_exp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText("<배변 실수하는 원인 세 가지>\n" +
                                "1. 분리 불안증이 있을 때\n" +
                                ": 보호자와의 지나친 불안정 애착 관계로 인해서 강아지 배변 실수하는 경우가 생긴다.\n" +
                                "\n" +
                                "2. 에너지 소비가 되지 않았을 때\n" +
                                ": 강아지 대소변 훈련을 시킬 때 가장 중요한 것은 산책이다. 산책을 하게 되면 노즈워크를 하면서 차분해지고 스트레스를 해소할 수 있다. 배변 실수하는 가장 큰 이유는 스트레스일 확률이 높다.\n" +
                                "\n" +
                                "3. 환경의 변화나 보호자 생활 패턴의 변화\n" +
                                ": 강아지들은 환경 변화에 정말 예민하다. 평상시에 대소변을 정말 잘 가리던 아이가 이사하고 갑자기 못 가리게 되는 경우도 상당히 많다. 또한, 보호자님이 항상 같이 있다가 갑자기 집을 비우는 시간이 많아져도 강아지 배변 실수를 많이 하게 될 수 있다.\n" +
                                "\n" +
                                "<교육 방법>\n" +
                                "1. 울타리 생활을 절대로 하지 말자\n" +
                                "2. 바닥보다 높고 푹신한 곳에 대소변을 보게 하자\n" +
                                "3. 대소변 보는 곳에는 간식을 주지 말자\n" +
                                "4. 배변을 잘 가렸을 때 과도한 리액션을 보이지 말자\n" +
                                "\n- 강아지 행동 교정 조*호 훈련사-\n"+
                                "\n" +
                                "\n");
                    }
                });
                break;
            case "강아지 목에 이물질이 걸렸을 때 증상과 대처":
                button_ar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(),"상위 3개의 정보 버튼만 활성화 되어있습니다. 3개 중 1개를 선택하세요.",Toast.LENGTH_SHORT).show();
                    }
                });
                button_exp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText("<강아지 목에 걸렸을 때 증상>\n" +
                                "1. 켁켁거림\n" +
                                "2. 식욕저하 및 활동성 저하\n" +
                                "3. 고통스러운 모습\n" +
                                "4. 호흡의 어려움\n" +
                                "\n" +
                                "<대처방법>\n" +
                                "> 강아지 입을 벌리고 혓바닥을 잡아당긴 뒤에 후레쉬를 이용해서 이물질이 걸려있는 모습이 확인되는지 살펴봐야 한다. 이때 심하게 발버둥을 치거나 흥분된 상태에서는 보호자분의 손을 물게 될 수도 있으니 주의해야 한다. 고개를 위로 향하게 한다면 이물질이 안쪽으로 더욱 더 들어갈 수 있으니 아래로 숙여두고 이물질을 확인해보는 것이 좋다.\n" +
                                "\n" +
                                "> 이물질이 보이더라도 잘 잡히지 않거나 배출이 어려운 경우에 무리하게 빼내려 하면 상처를 입히거나 더 안쪽으로 들어갈 수 있으니 주의해야 한다. 최대한 빠르게 동물 병원으로 이동하는 것이 가장 중요하지만 호흡을 못하는 등의 위급상황 시 강아지 하임리히법을 이용해서 응급조치를 취해주거나 이동하는 동안에 행하면 좋다.\n" +
                                "\n" +
                                "＞강아지 하임리히법\n" +
                                "1. 등두드리기 : 주로 체형이 작고 가벼운 소형견들에게 사용하는 방법이다. 보호자분이 한쪽 무릎만 꿇고 있는 자세에서 직각을 유지하고 있는 다리에 강아지 명치를 허벅지에 밀착해 고정한 뒤에 등 부분을 즉, 양쪽 어깨 사이에 손을 넓게 편 상태에서 손바닥을 이용해서 앞으로 밀어내듯 4~5회 정도를 너무 강하지 않을 정도로만 두들겨 주고 이물질이 나왔는지 확인한다.\n" +
                                "\n2. 가슴 압박 : 강아지가 이물질을 토하려고 켁켁거리는 순간에 가슴 밑부분과 턱밑까지 양손으로 압박한 상태에서 밀어서 올려주면서 제거해준다. 주의점으로는 부드러운 이물질은 상관없지만 직접적인 접촉이 발생되기 때문에 날카롭거나 단단한 이물질은 상처를 유발할 수도 있어서 주의가 필요하다.\n" +
                                "\n3. 가슴 누르기 : 이미 의식을 잃었을 경우 옆으로 누워있을 때 강아지 가슴의 가장 넓은 부분을 양손으로 4~5회 정도 빠르고 강하게 눌러준다. 이때 의식이 없기 때문에 목에서 이물질이 나와도 입안에 남아있기 때문에 압박 후에는 입안을 살펴보고 이물질이 나옸다면 제거해주는게 좋다. 이후에도 호흡이 없다면 심폐소생술을 반복해서 시도해줘야 한다.\n" +
                                "\n4. 뒷다리 들기 : 강아지의 뒷다리 혹은 허벅지를 잡고 위로 올려주면서 머리가 바닥을 향하도록 해준 뒤에 살짝씩 들었다가 놓는 것을 반복하며 중력에 의해서 이물질이 밖으로 배출되도록 해주는 방법이 있다.\n" +
                                "\n5. 강아지 하임리히법 : 강아지의 허리 즉, 갈비뼈가 끝나는 지점을 양손을 깍지를 끼고 그대로 압박하며 들었다가 놓는 것을 반복해주면 된다. 대형견의 경우 사람 하임리히법과 마찬가지로 한 쪽 손을 주먹을 쥡 상태에서 압박을 해주면 된다. 가장 위급상황 시 사용하는 방법으로 압박 시 갈비뼈 및 내잘기관의 손상우려도 있으니 천조각, 면장갑, 고무장갑, 페트병 뚜껑, 머리끈 등을 먹고 강아지 목에 이물질이 걸렸을 때 기도를 완전히 막아서 의식을 잃어가거나 호흡곤란이 발생했을 때 사용해주는 것을 권장드리며 5회 미만으로 사용해보시고 이후에 뒷다리를 다시 들어올려보거나 두들겨주는 등의 방법을 사용해주는게 좋다.\n" +
                                "\n- 동물 행동 전문가 최*호 훈련사 -\n"+
                                "\n" +
                                "\n");
                    }
                });
                break;
            case "목욕 주기 및 샤워 시 주의사항 알아보기":
                button_ar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(),"상위 3개의 정보 버튼만 활성화 되어있습니다. 3개 중 1개를 선택하세요.",Toast.LENGTH_SHORT).show();
                    }
                });
                button_exp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText("강아지 목욕시키는 방법>\n" +
                                "1. 빗질 : 목욕 전, 미리 엉킨 털들을 정리해주면 목욕이 끝난 후 빗질이 훨씬 수월해진다. 너무 심하게 엉킨 털들은 억지로 풀기보다는 살짝 잘라주는 것이 좋다.\n" +
                                "\n2. 물온도 : 너무 차갑거나 뜨거운 온도는 강아지가 목욕을 싫어하게 만들 수 있다. 반려견이 편안하게 느낄 수 있도록 미지근한 물로 씻겨주어야 한다.\n" +
                                "\n3. 샤워기 수압 : 샤어기의 소리와 수압으로 인해 반려견이 겁을 먹을 수 있다. 강아지 몸에 샤워기를 직접적으로 대서 물을 뿌리지 말고 손등으로 한 번 막아서 간접적으로 닿게 하는 것이 좋다. 강아지용 샤워기를 사용하는 것도 좋은 방법이다. 강아지 전용 샤워기는 수압을 조절할 수 있고, 돌기가 있는 제품은 죽은 털을 제거할 수 있기 때문에 물을 무서워하는 아이들에게 도움이 된다.\n" +
                                "\n4. 샴푸, 비누 : 목욕시에는 강아지 전용 샴푸 또는 비누를 사용해야 한다. 사람과 개는 피부의 두께가 다르기 때문에 ‘천연 제품’이라고 해도 사람용 샴푸와 비누는 반려견에게 피부병을 동반할 수 있다.\n" +
                                "\n5. 목욕 순서 : 샴푸나 비누칠을 할 때는 다리-몸통-얼굴 순으로 하고, 물로 헹굴 때는 얼굴-몸통-다리 순서로 해주는 것이 좋다. 반드시 반려견의 눈과 귀에 거품과 물이 들어가지 않도록 주의해줘야 한다!\n" +
                                "\n6. 털 말려주기 : 반려견에게 헤어드라이기의 뜨거운 바람에 화상을 입을 수 있기 때문에 드라이기를 사용할 때는 세심한 주의가 필요하다. 마른 수건을 여러 장 준비해 수건으로 물기를 최대한 제거해주고, 자연바람이나 선풍기를 이용해 천천히 말려주는 것이 좋다. 털을 말린 후에는 아이의 털 관리를 위해 강아지 전용 빗으로 세심하게 빗겨줘야 한다.\n" +
                                "\n" +
                                "<강아지 목욕 주기>\n" +
                                " 강아지에게 너무 작는 목욕은 피부 자극을 유발하기 때문에 특별한 이유가 없다면 3주에 한 번 정도가 적당한 목욕 주기이다. 만약, 목욕을 시켜줘도 악취가 난다면 귀, 입, 항문, 피부질환 등이 원인이 되는 경우가 있다. 반려견에게 악취가 심하게 난다면 목욕을 자주 씻기기보다 원인을 찾아서 해결해 주는 것이 바람직하다. \n" +
                                "\n" +
                                "<강아지 목욕 Tip!>\n" +
                                "목욕에 대한 좋은 인식을 심어줄 수 있도록 목욕 후에 간식을 주는 것도 좋은 방법!\n" +
                                "\n" +
                                "- 24시 *동물의료센터 -\n"+
                                "\n" +
                                "\n");
                    }
                });
                break;
            case "유기견 입양 시 꼭 알아둬야할 내용":
                button_ar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(),"상위 3개의 정보 버튼만 활성화 되어있습니다. 3개 중 1개를 선택하세요.",Toast.LENGTH_SHORT).show();
                    }
                });
                button_exp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText("<유기견 분양은 어디서 어떻게 알아볼까요?>\n" +
                                " 지방자치단체에서 운영하는 유기견보호소 혹은 개인이 직접 사비로 운영하거나 후원을 받아서 운영을 하는 사설유기견보호소에서 유기견 입양을 한다. 유기견을 데려오기 위해서는 정확하게 신분이 확인되어야 하명 지내는 환경도 살펴보고 중성화 수술을 반드시 시켜야하는 조건이 대부분이고 내장칩을 꼭 심어서 보내게 된다. 그 이유는 재파양, 재유기 이외에도 새끼를 낳는 목적으로 데리고 가는 개 농장 사람들도 존재하기 때문이다. 한 번 상처받은 강아지에게 절대로 이러한 행동을 해서는 안되는 것이도 그렇기 때문에 유기견을 데리고 오려고 하시는 분들이라면 더 더욱 신중히 생각해보고 입양을 결정해야한다.  \n" +
                                "\n" +
                                " 이외에도 강아지를 돈을 주고 사고 파는 것 자체가 상업적인 행위이기 때문에 애견샵이나 전문견사 등과 같은 애견판매업의 허가를 받은 곳만 이러한 행위가 가능하다. 강아지 무료분양을 알아보신다면 책임비라는 것에 대해서 미리 알아두시면 좋을 것 같다. 책임비는 보통 5만원 내외로 측정되며 이외에도 중성화 수술, 인식칩 등을 시키는 조건이 있는 경우도 있다.\n" +
                                "\n" +
                                "<유기견 입양 시 꼭 알아둬야 할 부분>\n" +
                                "▶ 유기견은 한 번 상처를 받은 강아지들이기 때문에 키우다가 다시 파양하거나 재유기 되는 일은 절대로 없어야 한다. 입양을 결정할 때 신중한 마음으로 결정을 해야 하며 여러 가지 문제 행동으로 인해서 함께 살아가는 게 힘들어지지 않도록 꼭 주의해야 한다.\n" +
                                "\n▶ 처음에 데리고 오게 되면 모든 환경이 낯설고 새롭기 때문에 보호자와의 적응하는 시간을 최대 한달까지도 봐야한다. 학대를 받았다던가 혹은 사람과의 교류가 없었던 강아지라면 그 시간이 더 오래걸릴 수 있다. 이때는 너무 부담스럽게 다가가고 스킨쉽라려고하기보단 다가오면 손을 내민 후에 냄새를 맡게 해주고 간식이나 사료를 통해서 손에 대한 긍정적인 인식을 심어주는게 좋다.\n" +
                                "\n▶ 사람 손을 극도로 무서워하고 만지려고하면 도망가거나 부들부들 몸을 떤다면 아마 학대받은 경험이 있거나 손에 대한 부정적인 기억이 있을 가능성이 있다. 강아지 성향마다 다르긴 하겠지만 외향적이고 사회성이 좋고 활발한 성격을 가진 강아지라면 금방 친화가 될 수 있지만 성격이 소심하고 내성적이며 사회성이 부족한 강아지라면 조급하게 친해지려고 부담스럽게 다가가 만진다면 오히려 경계심으로 인해 입질을 하게 될 가능성이 있다.\n" +
                                "\n▶ 유기견이다 보면 안쓰럽다고 생각해서 과잉보호를 하거나 잘못된 행동에 대해서 관대하게 넘어가는 경우가 많은데 단호하게 대할 때는 단호해지는 것도 중요하다. 어느정도 집에 적응하고 보호자와의 신뢰가 생기고 애착관계가 형성이 되면 함께 살아가기 위해서 집안에서 지켜야할 질서와 규칙을 정해서 그걸 잘 따를 수 있는 반려견으로 키워주어야 한다.\n" +
                                "\n▶ 특히 사람이나 다른 개에게 공격성을 보이거나 외부소리에 경계성 짖음이 심하고 사회성이 부족한 경우 보호자님이 교육을 해보시되 문제 행동이 개선이 잘 되지 않느다면 반드시 전문애견훈련사의 도움을 받아서 정확한 방법으로 행동 교정을 시켜나가는게 좋다.\n" +
                                "\n▶ 유기견의 경우, 한 번 버려진 기억으로 인해 사람에 대한 집착을 심하게 하게 될 수 있는데 그래서 분리불안이 생기게 될 수 있다. 여기서 분리불안 증상은 강아지를 혼자 집에 두고 외출했을 때 집안을 온톤 난리법석으로 만들어 놓다던가 계속 짖음이나 하울링을 통해 보호자를 찾는 행동, 배변을 이곳저곳 싸는 행동 등이 있다. 이 때는 독립심을 키워주기 위해 보호자님께서 훈련이 필요하다.\n" +
                                "\n▶ 기존에 키우던 반려견이 있다면 자기의 영역을 낯선 개가 침범해서 뺏으려고 한다는 생각이 들기도 한다. 보호자를 뺏어가는 존재라고 느낄 수도 있으니 기존에 키우던 반려견이 스트레스를 받지 않도록 새로 온 유기견을 과하게 예뻐하기보단 키우던 반려견을 먼저 챙겨주시는 것이 좋다. 서로의 체취가 뭍어있는 옷을 바꿔 입혀놓는 것도 빠르게 적응하는 방법이며 함께 산책을 다니며 즐거움을 느끼게 해주는 것도 좋다.\n" +
                                "\n" +
                                "- 동물 행동 전문가 조*호 애견훈련소장 -\n"+
                                "\n" +
                                "\n");
                    }
                });
                break;
            case "강아지 당근 간식으로 좋은 음식일까?":
                button_ar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(),"상위 3개의 정보 버튼만 활성화 되어있습니다. 3개 중 1개를 선택하세요.",Toast.LENGTH_SHORT).show();
                    }
                });
                button_exp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText("<강아지에게 좋은 음식 채소 당근 기대 효능>\n" +
                                "강아지에게 좋은 음식 당근에는 펙틴이 풍부하다. 펙틴은 수용성 식이섬유인데 몸 속 노폐물과 독소를 배출시키고 장의 운동을 활발하게 만들어 준다. 유산균의 먹이가 되어 장내 환경 개선에 도움을 주어 변비 증상을 개선하고 예방하는 효과가 있다. 또, 위와 장을 튼츤하게 해 소화기 건강에도 좋으며 비타민 C도 풍부하여 강아지 피부, 털빠짐(탈모) 예방도 기대할 수 있다.\n" +
                                "\n" +
                                "- 동물행동 전문가 라* -\n"+
                                "\n" +
                                "\n");
                    }
                });
                break;
            case "반려견 양치 주기, 입냄새 제거 방법은?":
                button_ar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(),"상위 3개의 정보 버튼만 활성화 되어있습니다. 3개 중 1개를 선택하세요.",Toast.LENGTH_SHORT).show();
                    }
                });
                button_exp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText("<강아지 양치 주기>\n" +
                                " 강아지 양치는 유치가 빠지고 영구치가 나오기 시작하는 5~6개월 시기부터 시작해주는게 좋다. 하지만 이보다 훨씬 전인 2~3개월때부터 시작해야 거부감이 생기는 것을 미리 예방해줄 수 있다. 영구치가 나오기 전까지는 가볍게 치약만 손으로 뭍혀서 거부감없이 익숙하게 만들어주고 난 뒤에 본격적인 양치를 시작해주면 된다. \n" +
                                "\n" +
                                "<입냄새 제거 원인과 대처 방법>\n" +
                                " 강아지에게서 입냄새가 나기 시작했다면 치주질환 등에 의해 고통이 심해서 양치가 어려울 수도 있기 때문에 우선 원인을 알아보고 그에 맞춰 대처를 해주는 것이 좋다. 치아문제뿐 아니라 다른 기관의 문제로도 발생할 수 있으니 이 점도 참고해야한다.\n" +
                                "\n" +
                                " 1. 구강 내 질환 : 평소 양치를 통한 관리가 제대로 이루어지지 않을 경우 잇몸에 염증이 진행되면서 치주염으로 발전하게 되고 그로 인해서 이빨리 흔들리거나 빠지기도 하고 고름이 차올라 치주질환이 발생하게 되어 강아지 입냄새의 원인이 될 수 있다. 이때는 무조건 양치질을 시작하는 것보다 동물병원을 방문하여 상태를 점검해보는 것이 낫다.\n" +
                                "\n" +
                                " 2. 소화 기간 문제 : 평소 과식이나 잘못된 식습관에 의해서 공복시간이 너무 길어질 경우 알레르기를 유발하는 음식물 섭취 등이 원인이 되어 입냄새를 유발할 수 있다. 불규칙적이고 잘못된 식습관을 갖고 있는지 혹은 알레르기로 인해 고생한다면 원인에 맞춰 처방식사료로 부담을 줄여준 뒤에 내복약을 통해 소화기관 속 염증을 제거해줘야 한다.\n" +
                                "\n" +
                                "3. 음수량 : 입이 건조해지고 침 분비량이 부족하면 세균번식이 많아지면서 입냄새를 유발하기 때문에 음수량이 부족하지는 않은지 살펴봐야 한다. 요즘처럼 실내에서 머물고 있는 시간이 많고 활동이 없어지면 그만큼 음수량이 줄어들게 되기 때문에 활동량을 늘려주는 것이 좋다. 너무 먹지 않는다면 약간의 과일즙이나 사료를 줄 때 물을 약간씩 섞어주는 방법도 좋은데 이또한 습관이 되면 물은 먹지 않을 수 있으니 활동량을 늘리면서 함께 물을 먹이도록 유도해주어야 입냄새 제거에 도움이 된다.\n" +
                                "\n" +
                                "- 동물 행동 전문가 최*호 훈련사 -\n"+
                                "\n" +
                                "\n");
                    }
                });
                break;

            default:
                button_ar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(),"상위 3개의 정보 버튼만 활성화 되어있습니다. 3개 중 1개를 선택하세요.",Toast.LENGTH_SHORT).show();
                    }
                });

                button_exp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext()," 설명 바로 보기",Toast.LENGTH_SHORT).show();
                    }
                });
                break;

        }

        return "okay";
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getContext(),"뒤로가기 눌림",Toast.LENGTH_SHORT).show();
    }

//    @Override
//    public void onResume() {
//        super.onResume();
//        activity.setOnBackPressedListener(this);
//    }
}