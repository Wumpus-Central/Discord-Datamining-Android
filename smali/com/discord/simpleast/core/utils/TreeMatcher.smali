.class public Lcom/discord/simpleast/core/utils/TreeMatcher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/simpleast/core/utils/TreeMatcher$NodeMatcher;
    }
.end annotation


# instance fields
.field private matchers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Lcom/discord/simpleast/core/utils/TreeMatcher$NodeMatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/discord/simpleast/core/utils/TreeMatcher;->matchers:Ljava/util/Map;

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
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
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
.end method


# virtual methods
.method public matches(Ljava/util/List;Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/simpleast/core/node/Node;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/simpleast/core/node/Node;",
            ">;)Z"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lcom/discord/simpleast/core/utils/TreeMatcher$1;

    .line 12
    .line 13
    invoke-direct {v2, p0, v0}, Lcom/discord/simpleast/core/utils/TreeMatcher$1;-><init>(Lcom/discord/simpleast/core/utils/TreeMatcher;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v2}, Lcom/discord/simpleast/core/utils/ASTUtils;->traversePostOrder(Ljava/util/Collection;Lcom/discord/simpleast/core/utils/NodeProcessor;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Lcom/discord/simpleast/core/utils/TreeMatcher$2;

    .line 20
    .line 21
    invoke-direct {p1, p0, v1}, Lcom/discord/simpleast/core/utils/TreeMatcher$2;-><init>(Lcom/discord/simpleast/core/utils/TreeMatcher;Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p2, p1}, Lcom/discord/simpleast/core/utils/ASTUtils;->traversePostOrder(Ljava/util/Collection;Lcom/discord/simpleast/core/utils/NodeProcessor;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eq p1, p2, :cond_0

    .line 37
    .line 38
    return v2

    .line 39
    :cond_0
    move p1, v2

    .line 40
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-ge p1, p2, :cond_3

    .line 45
    .line 46
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Lcom/discord/simpleast/core/node/Node;

    .line 51
    .line 52
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Lcom/discord/simpleast/core/node/Node;

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-eq v4, v5, :cond_1

    .line 67
    .line 68
    return v2

    .line 69
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    iget-object v5, p0, Lcom/discord/simpleast/core/utils/TreeMatcher;->matchers:Ljava/util/Map;

    .line 74
    .line 75
    invoke-interface {v5, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_2

    .line 80
    .line 81
    iget-object v5, p0, Lcom/discord/simpleast/core/utils/TreeMatcher;->matchers:Ljava/util/Map;

    .line 82
    .line 83
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, Lcom/discord/simpleast/core/utils/TreeMatcher$NodeMatcher;

    .line 88
    .line 89
    invoke-interface {v4, p2, v3}, Lcom/discord/simpleast/core/utils/TreeMatcher$NodeMatcher;->matches(Lcom/discord/simpleast/core/node/Node;Lcom/discord/simpleast/core/node/Node;)Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-nez p2, :cond_2

    .line 94
    .line 95
    return v2

    .line 96
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    const/4 p1, 0x1

    .line 100
    return p1
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
.end method

.method public registerDefaultMatchers()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/simpleast/core/utils/TreeMatcher$3;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/discord/simpleast/core/utils/TreeMatcher$3;-><init>(Lcom/discord/simpleast/core/utils/TreeMatcher;)V

    .line 4
    .line 5
    .line 6
    const-class v1, Lcom/discord/simpleast/core/node/TextNode;

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0}, Lcom/discord/simpleast/core/utils/TreeMatcher;->registerMatcher(Ljava/lang/Class;Lcom/discord/simpleast/core/utils/TreeMatcher$NodeMatcher;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/discord/simpleast/core/utils/TreeMatcher$4;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/discord/simpleast/core/utils/TreeMatcher$4;-><init>(Lcom/discord/simpleast/core/utils/TreeMatcher;)V

    .line 14
    .line 15
    .line 16
    const-class v1, Lcom/discord/simpleast/core/node/StyleNode;

    .line 17
    .line 18
    invoke-virtual {p0, v1, v0}, Lcom/discord/simpleast/core/utils/TreeMatcher;->registerMatcher(Ljava/lang/Class;Lcom/discord/simpleast/core/utils/TreeMatcher$NodeMatcher;)V

    .line 19
    .line 20
    .line 21
    return-void
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
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
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
.end method

.method public registerMatcher(Ljava/lang/Class;Lcom/discord/simpleast/core/utils/TreeMatcher$NodeMatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/simpleast/core/utils/TreeMatcher;->matchers:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
