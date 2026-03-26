package com.hellcat.domainModel;

import lombok.Getter;
import lombok.Setter;

/*Еще одна вещь, о которой забыли -- это факт, что вопреки всякой
вероятности, на высоте нескольких миль над чужой планетой был вызван к
существованию кашалот.
И поскольку это далеко не самое естественное положение для кита, то у
этого несчастного существа было очень мало времени на то, чтобы успеть
свыкнуться с осознанием того, что оно кит, перед тем, как ему пришлось
свыкнуться с осознанием того, что оно уже больше не кит.
Вот полная запись его мыслей с момента, когда началась его жизнь, до
момента, когда она окончилась.
Ах!.. что происходит? -- подумал кит.
Э-э, простите, кто я?
Привет...
Что я здесь делаю? Каково мое назначение в жизни?
А что я имею в виду, спрашивая, кто я?
Успокойся, приди в себя... о, это интересное ощущение, что это такое?
Это вроде... посасывания, дрожи у меня в... у меня в... пожалуй, мне нужно
начинать придумывать названия для разных вещей, если я хочу чего-то
достигнуть в том, что я для удобства назову миром, поэтому, скажем так: у
меня в желудке.
Отлично. Ого, крепчает. А что это за свистящий звук у меня в том, что я
буду называть ушами? Наверное, я назову это... ветер! По-моему, неплохое
название. Может быть, я найду какое-нибудь получше потом, когда выясню,
зачем он нужен. Наверное, он -- очень важная вещь, потому что его так много.
Оп, а это что за штука? Это... назовем это хвост, да, хвост. О, да я могу
здорово им бить! Ух ты, ух ты! Здорово! Правда, от него не видно никакого
толка, но попозже я выясню, для чего он. Ну что, я составил себе отчетливую
картину о природе вещей?
Нет.
Ну, ничего, все равно здорово. Столько нужно всего узнать, столько еще
будет, просто голова кружится...
Или это от ветра? Его так много.
Ух, ты! Оба-на! Что это движется ко мне так быстро? Очень, очень
быстро. Такое большое и плоское! Ему нужно очень красивое и звучное имя,
например... ля... мля... земля! Точно! Хорошее название.
Интересно, мы с ней подружимся?
А далее, после внезапного влажного удара, была тишина.*/


@Getter
public class Whale {
    private WhaleState state;
    private double timeToLive;
    private double totalTimeSpent;
    @Setter
    private Environment environment;
    private int IQ;

    public Whale(double initialTime) {
        totalTimeSpent = 0.0;
        state = WhaleState.CONFUSED;
        environment = Environment.AIR;
        timeToLive = initialTime;
        this.IQ = 100;
    }

    public Whale(double initialTime, int IQ) {
        this(initialTime);
        this.IQ = IQ;
    }

    public Whale(double initialTime, int IQ, Environment environment) {
        this(initialTime, IQ);
        this.environment = environment;
    }

    public void tryToRealizeIdentity(double timeSpent) {
        if (state == WhaleState.DEAD) return;

        if (!environment.isNaturalForWhale()) {
            timeToLive -= timeSpent;
        }
        totalTimeSpent += timeSpent;

        if (timeToLive <= 0) {
            die();
            return;
        }

        if (!environment.isNaturalForWhale()) {
            if (totalTimeSpent * IQ > 100) {
                this.state = WhaleState.AWARE_WHALE;
                return;
            }
        }
        if (totalTimeSpent * IQ > 10) {
            this.state = WhaleState.AWARE_WHALE;
        }
    }

    public void die() {
        this.state = WhaleState.DEAD;
        this.timeToLive = 0;
    }
}