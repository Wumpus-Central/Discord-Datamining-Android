.class Lcom/discord/simpleast/core/utils/TreeMatcher$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/simpleast/core/utils/TreeMatcher$NodeMatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/simpleast/core/utils/TreeMatcher;->registerDefaultMatchers()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/simpleast/core/utils/TreeMatcher;


# direct methods
.method constructor <init>(Lcom/discord/simpleast/core/utils/TreeMatcher;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/simpleast/core/utils/TreeMatcher$4;->this$0:Lcom/discord/simpleast/core/utils/TreeMatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public matches(Lcom/discord/simpleast/core/node/Node;Lcom/discord/simpleast/core/node/Node;)Z
    .locals 4

    .line 1
    check-cast p1, Lcom/discord/simpleast/core/node/StyleNode;

    .line 2
    .line 3
    check-cast p2, Lcom/discord/simpleast/core/node/StyleNode;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/discord/simpleast/core/node/StyleNode;->getStyles()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2}, Lcom/discord/simpleast/core/node/StyleNode;->getStyles()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    return v2

    .line 25
    :cond_0
    move v0, v2

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ge v0, v1, :cond_2

    .line 31
    .line 32
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Landroid/text/style/CharacterStyle;

    .line 37
    .line 38
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Landroid/text/style/CharacterStyle;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    if-eq v1, v3, :cond_1

    .line 53
    .line 54
    return v2

    .line 55
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/4 p1, 0x1

    .line 59
    return p1
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
.end method
