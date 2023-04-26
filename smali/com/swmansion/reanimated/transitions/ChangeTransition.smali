.class final Lcom/swmansion/reanimated/transitions/ChangeTransition;
.super Landroidx/transition/Transition;
.source "SourceFile"


# instance fields
.field private final mChangeBounds:Landroidx/transition/f;

.field private final mChangeTransform:Landroidx/transition/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/transition/g;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/transition/g;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeTransform:Landroidx/transition/g;

    .line 10
    .line 11
    new-instance v0, Landroidx/transition/f;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/transition/f;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeBounds:Landroidx/transition/f;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public captureEndValues(Landroidx/transition/f0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeTransform:Landroidx/transition/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/transition/g;->captureEndValues(Landroidx/transition/f0;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeBounds:Landroidx/transition/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/transition/f;->captureEndValues(Landroidx/transition/f0;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method

.method public captureStartValues(Landroidx/transition/f0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeTransform:Landroidx/transition/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/transition/g;->captureStartValues(Landroidx/transition/f0;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeBounds:Landroidx/transition/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/transition/f;->captureStartValues(Landroidx/transition/f0;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method

.method public createAnimator(Landroid/view/ViewGroup;Landroidx/transition/f0;Landroidx/transition/f0;)Landroid/animation/Animator;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeTransform:Landroidx/transition/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroidx/transition/g;->i(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeTransform:Landroidx/transition/g;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Landroidx/transition/g;->createAnimator(Landroid/view/ViewGroup;Landroidx/transition/f0;Landroidx/transition/f0;)Landroid/animation/Animator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v2, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeBounds:Landroidx/transition/f;

    .line 14
    .line 15
    invoke-virtual {v2, p1, p2, p3}, Landroidx/transition/f;->createAnimator(Landroid/view/ViewGroup;Landroidx/transition/f0;Landroidx/transition/f0;)Landroid/animation/Animator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    new-instance p2, Landroid/animation/AnimatorSet;

    .line 26
    .line 27
    invoke-direct {p2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 p3, 0x2

    .line 31
    new-array p3, p3, [Landroid/animation/Animator;

    .line 32
    .line 33
    aput-object v0, p3, v1

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    aput-object p1, p3, v0

    .line 37
    .line 38
    invoke-virtual {p2, p3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 39
    .line 40
    .line 41
    return-object p2
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
.end method

.method public setDuration(J)Landroidx/transition/Transition;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeTransform:Landroidx/transition/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/transition/Transition;->setDuration(J)Landroidx/transition/Transition;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeBounds:Landroidx/transition/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Landroidx/transition/Transition;->setDuration(J)Landroidx/transition/Transition;

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2}, Landroidx/transition/Transition;->setDuration(J)Landroidx/transition/Transition;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method

.method public setInterpolator(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeTransform:Landroidx/transition/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/transition/Transition;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeBounds:Landroidx/transition/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/transition/Transition;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Landroidx/transition/Transition;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method

.method public setPropagation(Landroidx/transition/b0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeTransform:Landroidx/transition/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/transition/Transition;->setPropagation(Landroidx/transition/b0;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeBounds:Landroidx/transition/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/transition/Transition;->setPropagation(Landroidx/transition/b0;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Landroidx/transition/Transition;->setPropagation(Landroidx/transition/b0;)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method

.method public setStartDelay(J)Landroidx/transition/Transition;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeTransform:Landroidx/transition/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/transition/Transition;->setStartDelay(J)Landroidx/transition/Transition;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/ChangeTransition;->mChangeBounds:Landroidx/transition/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Landroidx/transition/Transition;->setStartDelay(J)Landroidx/transition/Transition;

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2}, Landroidx/transition/Transition;->setStartDelay(J)Landroidx/transition/Transition;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method
