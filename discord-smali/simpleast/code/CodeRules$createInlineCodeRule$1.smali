.class public final Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;
.super Lcom/discord/simpleast/core/parser/Rule;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/simpleast/code/CodeRules;->createInlineCodeRule(Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;)Lcom/discord/simpleast/core/parser/Rule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/discord/simpleast/core/parser/Rule<",
        "TR;",
        "Lcom/discord/simpleast/core/node/Node<",
        "TR;>;TS;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u0001JK\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u000c\u0008\u0000\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u00082\u0006\u0010\t\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/discord/simpleast/code/CodeRules$createInlineCodeRule$1",
        "Lcom/discord/simpleast/core/parser/Rule;",
        "Lcom/discord/simpleast/core/node/Node;",
        "parse",
        "Lcom/discord/simpleast/core/parser/ParseSpec;",
        "matcher",
        "Ljava/util/regex/Matcher;",
        "parser",
        "Lcom/discord/simpleast/core/parser/Parser;",
        "state",
        "(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;",
        "simpleast-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $bgStyleProvider:Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

.field final synthetic $textStyleProvider:Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

.field final synthetic this$0:Lcom/discord/simpleast/code/CodeRules;


# direct methods
.method constructor <init>(Lcom/discord/simpleast/code/CodeRules;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Ljava/util/regex/Pattern;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;",
            "Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;",
            "Ljava/util/regex/Pattern;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;->this$0:Lcom/discord/simpleast/code/CodeRules;

    iput-object p2, p0, Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;->$textStyleProvider:Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    iput-object p3, p0, Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;->$bgStyleProvider:Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    invoke-direct {p0, p4}, Lcom/discord/simpleast/core/parser/Rule;-><init>(Ljava/util/regex/Pattern;)V

    return-void
.end method


# virtual methods
.method public parse(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/regex/Matcher;",
            "Lcom/discord/simpleast/core/parser/Parser<",
            "TR;-",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;TS;)",
            "Lcom/discord/simpleast/core/parser/ParseSpec<",
            "TR;TS;>;"
        }
    .end annotation

    .line 1
    const-string v0, "matcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parser"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p2, 0x2

    .line 12
    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p2, ""

    .line 20
    .line 21
    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    move v0, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v0, v2

    .line 32
    :goto_1
    if-eqz v0, :cond_2

    .line 33
    .line 34
    sget-object p2, Lcom/discord/simpleast/core/parser/ParseSpec;->Companion:Lcom/discord/simpleast/core/parser/ParseSpec$Companion;

    .line 35
    .line 36
    new-instance v0, Lcom/discord/simpleast/core/node/TextNode;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v1, "matcher.group()"

    .line 43
    .line 44
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, p1}, Lcom/discord/simpleast/core/node/TextNode;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v0, p3}, Lcom/discord/simpleast/core/parser/ParseSpec$Companion;->createTerminal(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :cond_2
    new-instance p1, Lcom/discord/simpleast/code/CodeNode$Content$Raw;

    .line 56
    .line 57
    invoke-direct {p1, p2}, Lcom/discord/simpleast/code/CodeNode$Content$Raw;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance p2, Lcom/discord/simpleast/code/CodeNode;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    iget-object v3, p0, Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;->$textStyleProvider:Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 64
    .line 65
    invoke-direct {p2, p1, v0, v3}, Lcom/discord/simpleast/code/CodeNode;-><init>(Lcom/discord/simpleast/code/CodeNode$Content;Ljava/lang/String;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;)V

    .line 66
    .line 67
    .line 68
    new-instance p1, Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1$parse$node$1;

    .line 69
    .line 70
    new-array v0, v1, [Lcom/discord/simpleast/core/node/Node;

    .line 71
    .line 72
    aput-object p2, v0, v2

    .line 73
    .line 74
    invoke-direct {p1, p0, p2, v0}, Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1$parse$node$1;-><init>(Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;Lcom/discord/simpleast/code/CodeNode;[Lcom/discord/simpleast/core/node/Node;)V

    .line 75
    .line 76
    .line 77
    sget-object p2, Lcom/discord/simpleast/core/parser/ParseSpec;->Companion:Lcom/discord/simpleast/core/parser/ParseSpec$Companion;

    .line 78
    .line 79
    invoke-virtual {p2, p1, p3}, Lcom/discord/simpleast/core/parser/ParseSpec$Companion;->createTerminal(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1
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
    .line 175
    .line 176
.end method