.class public final Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\u0008\u0000\u0010\u0016\"\u0004\u0008\u0001\u0010\u0018J*\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\u0008\u0000\u0010\u0016\"\u0004\u0008\u0001\u0010\u0018J*\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\u0008\u0000\u0010\u0016\"\u0004\u0008\u0001\u0010\u0018J*\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\u0008\u0000\u0010\u0016\"\u0004\u0008\u0001\u0010\u0018JF\u0010\u001c\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u00150\u001d\"\u0004\u0008\u0000\u0010\u0016\"\u0004\u0008\u0001\u0010\u00182\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001f2\u0008\u0008\u0002\u0010 \u001a\u00020\u001fH\u0007JH\u0010!\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\u0008\u0000\u0010\u0016\"\u0004\u0008\u0001\u0010\u00182\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0%0$H\u0007J*\u0010\'\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\u0008\u0000\u0010\u0016\"\u0004\u0008\u0001\u0010\u0018J*\u0010(\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\u0008\u0000\u0010\u0016\"\u0004\u0008\u0001\u0010\u0018J*\u0010)\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\u0008\u0000\u0010\u0016\"\u0004\u0008\u0001\u0010\u0018R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0019\u0010\u0008\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0019\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007R\u0019\u0010\u000c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0007R\u0019\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0007R\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0007R\u0019\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0007\u00a8\u0006*"
    }
    d2 = {
        "Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;",
        "",
        "()V",
        "PATTERN_BOLD",
        "Ljava/util/regex/Pattern;",
        "kotlin.jvm.PlatformType",
        "getPATTERN_BOLD",
        "()Ljava/util/regex/Pattern;",
        "PATTERN_ESCAPE",
        "getPATTERN_ESCAPE",
        "PATTERN_ITALICS",
        "getPATTERN_ITALICS",
        "PATTERN_NEWLINE",
        "getPATTERN_NEWLINE",
        "PATTERN_STRIKETHRU",
        "getPATTERN_STRIKETHRU",
        "PATTERN_TEXT",
        "getPATTERN_TEXT",
        "PATTERN_UNDERLINE",
        "getPATTERN_UNDERLINE",
        "createBoldRule",
        "Lcom/discord/simpleast/core/parser/Rule;",
        "R",
        "Lcom/discord/simpleast/core/node/Node;",
        "S",
        "createEscapeRule",
        "createItalicsRule",
        "createNewlineRule",
        "createSimpleMarkdownRules",
        "",
        "includeTextRule",
        "",
        "includeEscapeRule",
        "createSimpleStyleRule",
        "pattern",
        "styleFactory",
        "Lkotlin/Function0;",
        "",
        "Landroid/text/style/CharacterStyle;",
        "createStrikethruRule",
        "createTextRule",
        "createUnderlineRule",
        "simpleast-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;

.field private static final PATTERN_BOLD:Ljava/util/regex/Pattern;

.field private static final PATTERN_ESCAPE:Ljava/util/regex/Pattern;

.field private static final PATTERN_ITALICS:Ljava/util/regex/Pattern;

.field private static final PATTERN_NEWLINE:Ljava/util/regex/Pattern;

.field private static final PATTERN_STRIKETHRU:Ljava/util/regex/Pattern;

.field private static final PATTERN_TEXT:Ljava/util/regex/Pattern;

.field private static final PATTERN_UNDERLINE:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->INSTANCE:Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;

    .line 7
    .line 8
    const-string v0, "^\\*\\*([\\s\\S]+?)\\*\\*(?!\\*)"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_BOLD:Ljava/util/regex/Pattern;

    .line 15
    .line 16
    const-string v0, "^__([\\s\\S]+?)__(?!_)"

    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_UNDERLINE:Ljava/util/regex/Pattern;

    .line 23
    .line 24
    const-string v0, "^~~(?=\\S)([\\s\\S]*?\\S)~~"

    .line 25
    .line 26
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_STRIKETHRU:Ljava/util/regex/Pattern;

    .line 31
    .line 32
    const-string v0, "^(?:\\n *)*\\n"

    .line 33
    .line 34
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_NEWLINE:Ljava/util/regex/Pattern;

    .line 39
    .line 40
    const-string v0, "^[\\s\\S]+?(?=[^0-9A-Za-z\\s\\u00c0-\\uffff]|\\n| {2,}\\n|\\w+:\\S|$)"

    .line 41
    .line 42
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_TEXT:Ljava/util/regex/Pattern;

    .line 47
    .line 48
    const-string v0, "^\\\\([^0-9A-Za-z\\s])"

    .line 49
    .line 50
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_ESCAPE:Ljava/util/regex/Pattern;

    .line 55
    .line 56
    const-string v0, "^\\b_((?:__|\\\\[\\s\\S]|[^\\\\_])+?)_\\b|^\\*(?=\\S)((?:\\*\\*|\\s+(?:[^*\\s]|\\*\\*)|[^\\s*])+?)\\*(?!\\*)"

    .line 57
    .line 58
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_ITALICS:Ljava/util/regex/Pattern;

    .line 63
    .line 64
    return-void
    .line 65
    .line 66
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final createSimpleMarkdownRules()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/List<",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;>;"
        }
    .end annotation

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createSimpleMarkdownRules$default(ZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final createSimpleMarkdownRules(Z)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(Z)",
            "Ljava/util/List<",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createSimpleMarkdownRules$default(ZZILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final createSimpleMarkdownRules(ZZ)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(ZZ)",
            "Ljava/util/List<",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;>;"
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
    if-eqz p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->INSTANCE:Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createEscapeRule()Lcom/discord/simpleast/core/parser/Rule;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p1, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->INSTANCE:Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createNewlineRule()Lcom/discord/simpleast/core/parser/Rule;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createBoldRule()Lcom/discord/simpleast/core/parser/Rule;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createUnderlineRule()Lcom/discord/simpleast/core/parser/Rule;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createItalicsRule()Lcom/discord/simpleast/core/parser/Rule;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createStrikethruRule()Lcom/discord/simpleast/core/parser/Rule;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createTextRule()Lcom/discord/simpleast/core/parser/Rule;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :cond_1
    return-object v0
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
.end method

.method public static synthetic createSimpleMarkdownRules$default(ZZILjava/lang/Object;)Ljava/util/List;
    .locals 1

    and-int/lit8 p3, p2, 0x1

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    move p0, v0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    move p1, v0

    :cond_1
    invoke-static {p0, p1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createSimpleMarkdownRules(ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final createSimpleStyleRule(Ljava/util/regex/Pattern;Lkotlin/jvm/functions/Function0;)Lcom/discord/simpleast/core/parser/Rule;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/regex/Pattern;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroid/text/style/CharacterStyle;",
            ">;>;)",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;"
        }
    .end annotation

    .line 1
    const-string v0, "pattern"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "styleFactory"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createSimpleStyleRule$1;

    .line 12
    .line 13
    invoke-direct {v0, p1, p0, p0}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createSimpleStyleRule$1;-><init>(Lkotlin/jvm/functions/Function0;Ljava/util/regex/Pattern;Ljava/util/regex/Pattern;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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
.end method


# virtual methods
.method public final createBoldRule()Lcom/discord/simpleast/core/parser/Rule;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;"
        }
    .end annotation

    sget-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_BOLD:Ljava/util/regex/Pattern;

    const-string v1, "PATTERN_BOLD"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createBoldRule$1;->INSTANCE:Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createBoldRule$1;

    invoke-static {v0, v1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createSimpleStyleRule(Ljava/util/regex/Pattern;Lkotlin/jvm/functions/Function0;)Lcom/discord/simpleast/core/parser/Rule;

    move-result-object v0

    return-object v0
.end method

.method public final createEscapeRule()Lcom/discord/simpleast/core/parser/Rule;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;"
        }
    .end annotation

    new-instance v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createEscapeRule$1;

    sget-object v1, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_ESCAPE:Ljava/util/regex/Pattern;

    const-string v2, "PATTERN_ESCAPE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0, v1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createEscapeRule$1;-><init>(Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;Ljava/util/regex/Pattern;)V

    return-object v0
.end method

.method public final createItalicsRule()Lcom/discord/simpleast/core/parser/Rule;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;"
        }
    .end annotation

    new-instance v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createItalicsRule$1;

    sget-object v1, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_ITALICS:Ljava/util/regex/Pattern;

    const-string v2, "PATTERN_ITALICS"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0, v1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createItalicsRule$1;-><init>(Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;Ljava/util/regex/Pattern;)V

    return-object v0
.end method

.method public final createNewlineRule()Lcom/discord/simpleast/core/parser/Rule;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;"
        }
    .end annotation

    new-instance v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createNewlineRule$1;

    sget-object v1, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_NEWLINE:Ljava/util/regex/Pattern;

    const-string v2, "PATTERN_NEWLINE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0, v1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createNewlineRule$1;-><init>(Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;Ljava/util/regex/Pattern;)V

    return-object v0
.end method

.method public final createStrikethruRule()Lcom/discord/simpleast/core/parser/Rule;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;"
        }
    .end annotation

    sget-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_STRIKETHRU:Ljava/util/regex/Pattern;

    const-string v1, "PATTERN_STRIKETHRU"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createStrikethruRule$1;->INSTANCE:Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createStrikethruRule$1;

    invoke-static {v0, v1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createSimpleStyleRule(Ljava/util/regex/Pattern;Lkotlin/jvm/functions/Function0;)Lcom/discord/simpleast/core/parser/Rule;

    move-result-object v0

    return-object v0
.end method

.method public final createTextRule()Lcom/discord/simpleast/core/parser/Rule;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;"
        }
    .end annotation

    new-instance v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createTextRule$1;

    sget-object v1, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_TEXT:Ljava/util/regex/Pattern;

    const-string v2, "PATTERN_TEXT"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0, v1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createTextRule$1;-><init>(Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;Ljava/util/regex/Pattern;)V

    return-object v0
.end method

.method public final createUnderlineRule()Lcom/discord/simpleast/core/parser/Rule;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;"
        }
    .end annotation

    sget-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_UNDERLINE:Ljava/util/regex/Pattern;

    const-string v1, "PATTERN_UNDERLINE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createUnderlineRule$1;->INSTANCE:Lcom/discord/simpleast/core/simple/SimpleMarkdownRules$createUnderlineRule$1;

    invoke-static {v0, v1}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createSimpleStyleRule(Ljava/util/regex/Pattern;Lkotlin/jvm/functions/Function0;)Lcom/discord/simpleast/core/parser/Rule;

    move-result-object v0

    return-object v0
.end method

.method public final getPATTERN_BOLD()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_BOLD:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public final getPATTERN_ESCAPE()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_ESCAPE:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public final getPATTERN_ITALICS()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_ITALICS:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public final getPATTERN_NEWLINE()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_NEWLINE:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public final getPATTERN_STRIKETHRU()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_STRIKETHRU:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public final getPATTERN_TEXT()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_TEXT:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public final getPATTERN_UNDERLINE()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->PATTERN_UNDERLINE:Ljava/util/regex/Pattern;

    return-object v0
.end method
