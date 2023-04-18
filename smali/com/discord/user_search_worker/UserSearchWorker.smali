.class public final Lcom/discord/user_search_worker/UserSearchWorker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/user_search_worker/UserSearchWorker$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B-\u0012$\u0010!\u001a \u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u001e\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0008H\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\u0004R5\u0010!\u001a \u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000c0(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010*\u00a8\u0006/"
    }
    d2 = {
        "Lcom/discord/user_search_worker/UserSearchWorker;",
        "",
        "Lcom/discord/user_search_worker/UserSearchUpdateUsersData;",
        "data",
        "",
        "mergeUsers",
        "Lcom/discord/user_search_worker/UserSearchQuerySetData;",
        "setNewQuery",
        "Lcom/discord/user_search_worker/UserSearchQueryClearData;",
        "clearQuery",
        "",
        "id",
        "Lcom/discord/user_search_worker/UserSearchTransformedUser;",
        "user",
        "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;",
        "payload",
        "",
        "isValid",
        "needleBase",
        "haystackBase",
        "fuzzySearch",
        "",
        "score",
        "booster",
        "calculateScore",
        "uuid",
        "searchUsers",
        "dataJSON",
        "onMessage",
        "terminate",
        "Lkotlin/Function3;",
        "",
        "Lcom/discord/user_search_worker/UserSearchWorkerResult;",
        "onResults",
        "Lkotlin/jvm/functions/Function3;",
        "getOnResults",
        "()Lkotlin/jvm/functions/Function3;",
        "Lkotlinx/serialization/json/Json;",
        "json",
        "Lkotlinx/serialization/json/Json;",
        "",
        "users",
        "Ljava/util/Map;",
        "queries",
        "<init>",
        "(Lkotlin/jvm/functions/Function3;)V",
        "Companion",
        "user_search_worker_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final CONTAIN_MATCH_VALUE:D = 5.0

.field public static final Companion:Lcom/discord/user_search_worker/UserSearchWorker$Companion;

.field private static final EXACT_MATCH_VALUE:D = 10.0

.field private static final FUZZY_MATCH_VALUE:D = 1.0

.field private static final STRIP_DIACRITICS_REGEX_PATTERN:Lkotlin/text/Regex;


# instance fields
.field private final json:Lkotlinx/serialization/json/Json;

.field private final onResults:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/util/List<",
            "Lcom/discord/user_search_worker/UserSearchWorkerResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final queries:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;",
            ">;"
        }
    .end annotation
.end field

.field private final users:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/discord/user_search_worker/UserSearchTransformedUser;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/user_search_worker/UserSearchWorker$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/user_search_worker/UserSearchWorker$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/user_search_worker/UserSearchWorker;->Companion:Lcom/discord/user_search_worker/UserSearchWorker$Companion;

    .line 8
    .line 9
    new-instance v0, Lkotlin/text/Regex;

    .line 10
    .line 11
    const-string v1, "[\\u0300-\\u036f]"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcom/discord/user_search_worker/UserSearchWorker;->STRIP_DIACRITICS_REGEX_PATTERN:Lkotlin/text/Regex;

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

.method public constructor <init>(Lkotlin/jvm/functions/Function3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/util/List<",
            "Lcom/discord/user_search_worker/UserSearchWorkerResult;",
            ">;-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "onResults"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/discord/user_search_worker/UserSearchWorker;->onResults:Lkotlin/jvm/functions/Function3;

    .line 10
    .line 11
    sget-object p1, Lcom/discord/user_search_worker/UserSearchWorker$json$1;->INSTANCE:Lcom/discord/user_search_worker/UserSearchWorker$json$1;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {v1, p1, v0, v1}, Lkotlinx/serialization/json/k;->b(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/serialization/json/Json;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/discord/user_search_worker/UserSearchWorker;->json:Lkotlinx/serialization/json/Json;

    .line 20
    .line 21
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/discord/user_search_worker/UserSearchWorker;->users:Ljava/util/Map;

    .line 27
    .line 28
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/discord/user_search_worker/UserSearchWorker;->queries:Ljava/util/Map;

    .line 34
    .line 35
    return-void
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
.end method

.method public static final synthetic access$getSTRIP_DIACRITICS_REGEX_PATTERN$cp()Lkotlin/text/Regex;
    .locals 1

    sget-object v0, Lcom/discord/user_search_worker/UserSearchWorker;->STRIP_DIACRITICS_REGEX_PATTERN:Lkotlin/text/Regex;

    return-object v0
.end method

.method private final calculateScore(DD)D
    .locals 2

    const-wide/16 v0, 0x0

    cmpg-double v0, p3, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const-wide/high16 p3, 0x3ff0000000000000L    # 1.0

    :cond_1
    mul-double/2addr p1, p3

    return-wide p1
.end method

.method private final clearQuery(Lcom/discord/user_search_worker/UserSearchQueryClearData;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchWorker;->queries:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/discord/user_search_worker/UserSearchQueryClearData;->getUuid()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final fuzzySearch(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    .line 8
    .line 9
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-static {p2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    if-le v1, v0, :cond_0

    .line 29
    .line 30
    return v2

    .line 31
    :cond_0
    if-ne v1, v0, :cond_1

    .line 32
    .line 33
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    move v3, v2

    .line 43
    move v4, v3

    .line 44
    :goto_0
    if-ge v3, v1, :cond_5

    .line 45
    .line 46
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    :goto_1
    if-ge v4, v0, :cond_3

    .line 51
    .line 52
    add-int/lit8 v6, v4, 0x1

    .line 53
    .line 54
    invoke-virtual {p2, v4}, Ljava/lang/String;->charAt(I)C

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-ne v4, v5, :cond_2

    .line 59
    .line 60
    move v4, v6

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move v4, v6

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :goto_2
    if-ne v4, v0, :cond_4

    .line 65
    .line 66
    return v2

    .line 67
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_5
    const/4 p1, 0x1

    .line 71
    return p1
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

.method private final isValid(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchTransformedUser;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)Z
    .locals 3

    .line 1
    invoke-virtual {p3}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->getBlacklist()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p3}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->getBlacklist()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    invoke-virtual {p3}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->getWhitelist()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x1

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p3}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->getWhitelist()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    return v2

    .line 37
    :cond_1
    invoke-virtual {p3}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->getFilters()Lcom/discord/user_search_worker/UserSearchQuerySetFilters;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_6

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/discord/user_search_worker/UserSearchQuerySetFilters;->getFriends()Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    if-eqz p3, :cond_2

    .line 48
    .line 49
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move p3, v1

    .line 55
    :goto_0
    invoke-virtual {p2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->isFriend()Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    move v0, v1

    .line 67
    :goto_1
    invoke-virtual {p1}, Lcom/discord/user_search_worker/UserSearchQuerySetFilters;->getGuild()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p3, :cond_4

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    return v2

    .line 76
    :cond_4
    invoke-virtual {p2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getNicknames()Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    return v2

    .line 87
    :cond_5
    return v1

    .line 88
    :cond_6
    return v2
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
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
.end method

.method private final mergeUsers(Lcom/discord/user_search_worker/UserSearchUpdateUsersData;)V
    .locals 12

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/discord/user_search_worker/UserSearchUpdateUsersData;->getPayload()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_a

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lcom/discord/user_search_worker/UserSearchTransformedUser;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getId()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, p0, Lcom/discord/user_search_worker/UserSearchWorker;->users:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lcom/discord/user_search_worker/UserSearchTransformedUser;

    .line 38
    .line 39
    if-eqz v4, :cond_5

    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getId()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getUsername()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-virtual {v2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->isBot()Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    if-nez v5, :cond_1

    .line 54
    .line 55
    invoke-virtual {v4}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->isBot()Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    :cond_1
    move-object v8, v5

    .line 60
    invoke-virtual {v2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->isFriend()Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-nez v5, :cond_2

    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->isFriend()Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    :cond_2
    move-object v9, v5

    .line 71
    invoke-virtual {v2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getFriendNickname()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    if-nez v5, :cond_3

    .line 76
    .line 77
    invoke-virtual {v4}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getFriendNickname()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    :cond_3
    move-object v10, v5

    .line 82
    invoke-virtual {v4}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getNicknames()Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getNicknames()Ljava/util/Map;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    invoke-static {v5, v11}, Lmf/s;->o(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 91
    .line 92
    .line 93
    move-result-object v11

    .line 94
    move-object v5, v4

    .line 95
    invoke-virtual/range {v5 .. v11}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lcom/discord/user_search_worker/UserSearchTransformedUser;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    if-nez v5, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    move-object v2, v5

    .line 103
    :cond_5
    :goto_1
    iget-object v5, p0, Lcom/discord/user_search_worker/UserSearchWorker;->users:Ljava/util/Map;

    .line 104
    .line 105
    invoke-interface {v5, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    iget-object v3, p0, Lcom/discord/user_search_worker/UserSearchWorker;->queries:Ljava/util/Map;

    .line 109
    .line 110
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    const/4 v5, 0x1

    .line 115
    xor-int/2addr v3, v5

    .line 116
    if-eqz v3, :cond_0

    .line 117
    .line 118
    invoke-virtual {v2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->isFriend()Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    const/4 v6, 0x0

    .line 123
    if-eqz v4, :cond_6

    .line 124
    .line 125
    invoke-virtual {v4}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->isFriend()Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    goto :goto_2

    .line 130
    :cond_6
    move-object v7, v6

    .line 131
    :goto_2
    invoke-static {v3, v7}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_8

    .line 136
    .line 137
    invoke-virtual {v2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getFriendNickname()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-eqz v4, :cond_7

    .line 142
    .line 143
    invoke-virtual {v4}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getFriendNickname()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    :cond_7
    invoke-static {v3, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-nez v3, :cond_9

    .line 152
    .line 153
    :cond_8
    move v1, v5

    .line 154
    :cond_9
    invoke-virtual {v2}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getNicknames()Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 163
    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_a
    iget-object p1, p0, Lcom/discord/user_search_worker/UserSearchWorker;->queries:Ljava/util/Map;

    .line 168
    .line 169
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    :cond_b
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_d

    .line 182
    .line 183
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, Ljava/util/Map$Entry;

    .line 188
    .line 189
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    check-cast v3, Ljava/lang/String;

    .line 194
    .line 195
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    check-cast v2, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    .line 200
    .line 201
    invoke-virtual {v2}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->getFilters()Lcom/discord/user_search_worker/UserSearchQuerySetFilters;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    if-eqz v4, :cond_c

    .line 206
    .line 207
    invoke-virtual {v4}, Lcom/discord/user_search_worker/UserSearchQuerySetFilters;->getFriends()Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-nez v5, :cond_c

    .line 220
    .line 221
    invoke-virtual {v4}, Lcom/discord/user_search_worker/UserSearchQuerySetFilters;->getGuild()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    if-eqz v5, :cond_b

    .line 226
    .line 227
    invoke-virtual {v4}, Lcom/discord/user_search_worker/UserSearchQuerySetFilters;->getGuild()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_b

    .line 236
    .line 237
    :cond_c
    invoke-direct {p0, v3, v2}, Lcom/discord/user_search_worker/UserSearchWorker;->searchUsers(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_d
    return-void
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
.end method

.method private final searchUsers(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->getQuery()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual/range {p2 .. p2}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->getFilters()Lcom/discord/user_search_worker/UserSearchQuerySetFilters;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v3}, Lcom/discord/user_search_worker/UserSearchQuerySetFilters;->getStrict()Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v3, v4

    .line 28
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    const/4 v7, 0x1

    .line 38
    if-nez v6, :cond_1

    .line 39
    .line 40
    move v6, v7

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v6, v4

    .line 43
    :goto_1
    if-eqz v6, :cond_2

    .line 44
    .line 45
    iget-object v3, v0, Lcom/discord/user_search_worker/UserSearchWorker;->onResults:Lkotlin/jvm/functions/Function3;

    .line 46
    .line 47
    invoke-interface {v3, v5, v2, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    sget-object v6, Lkotlin/text/Regex;->l:Lkotlin/text/Regex$a;

    .line 52
    .line 53
    invoke-virtual {v6, v2}, Lkotlin/text/Regex$a;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    new-instance v8, Lkotlin/text/Regex;

    .line 58
    .line 59
    new-instance v9, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v10, "^"

    .line 65
    .line 66
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    sget-object v10, Lpi/j;->m:Lpi/j;

    .line 77
    .line 78
    invoke-direct {v8, v9, v10}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lpi/j;)V

    .line 79
    .line 80
    .line 81
    new-instance v9, Lkotlin/text/Regex;

    .line 82
    .line 83
    invoke-direct {v9, v6, v10}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lpi/j;)V

    .line 84
    .line 85
    .line 86
    iget-object v6, v0, Lcom/discord/user_search_worker/UserSearchWorker;->users:Ljava/util/Map;

    .line 87
    .line 88
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    const/4 v11, 0x2

    .line 101
    if-eqz v10, :cond_f

    .line 102
    .line 103
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    check-cast v10, Ljava/util/Map$Entry;

    .line 108
    .line 109
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    check-cast v12, Ljava/lang/String;

    .line 114
    .line 115
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    check-cast v10, Lcom/discord/user_search_worker/UserSearchTransformedUser;

    .line 120
    .line 121
    invoke-virtual {v10}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getUsername()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v19

    .line 125
    move-object/from16 v15, p2

    .line 126
    .line 127
    invoke-direct {v0, v12, v10, v15}, Lcom/discord/user_search_worker/UserSearchWorker;->isValid(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchTransformedUser;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)Z

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    if-nez v13, :cond_3

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_3
    const/16 v20, 0x0

    .line 135
    .line 136
    if-ne v3, v7, :cond_5

    .line 137
    .line 138
    const/4 v13, 0x3

    .line 139
    new-array v13, v13, [Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v10}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getUsername()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    aput-object v14, v13, v4

    .line 146
    .line 147
    invoke-virtual {v10}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getFriendNickname()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    aput-object v14, v13, v7

    .line 152
    .line 153
    invoke-virtual {v10}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getNicknames()Ljava/util/Map;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-virtual/range {p2 .. p2}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->getFilters()Lcom/discord/user_search_worker/UserSearchQuerySetFilters;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    if-eqz v14, :cond_4

    .line 162
    .line 163
    invoke-virtual {v14}, Lcom/discord/user_search_worker/UserSearchQuerySetFilters;->getGuild()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    goto :goto_3

    .line 168
    :cond_4
    move-object/from16 v14, v20

    .line 169
    .line 170
    :goto_3
    invoke-interface {v10, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    check-cast v10, Ljava/lang/String;

    .line 175
    .line 176
    aput-object v10, v13, v11

    .line 177
    .line 178
    invoke-static {v13}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    goto :goto_4

    .line 183
    :cond_5
    if-nez v3, :cond_e

    .line 184
    .line 185
    new-array v11, v11, [Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v10}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getUsername()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v13

    .line 191
    aput-object v13, v11, v4

    .line 192
    .line 193
    invoke-virtual {v10}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getFriendNickname()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v13

    .line 197
    aput-object v13, v11, v7

    .line 198
    .line 199
    invoke-static {v11}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    invoke-virtual {v10}, Lcom/discord/user_search_worker/UserSearchTransformedUser;->getNicknames()Ljava/util/Map;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    invoke-interface {v10}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-static {v11, v10}, Lkotlin/collections/h;->o0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    :goto_4
    invoke-static {v10}, Lkotlin/collections/h;->R(Ljava/lang/Iterable;)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    move-object/from16 v11, v20

    .line 224
    .line 225
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v13

    .line 229
    if-eqz v13, :cond_c

    .line 230
    .line 231
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v13

    .line 235
    check-cast v13, Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual/range {p2 .. p2}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->getBoosters()Ljava/util/Map;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    invoke-interface {v14, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    check-cast v14, Ljava/lang/Double;

    .line 246
    .line 247
    if-eqz v14, :cond_6

    .line 248
    .line 249
    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    .line 250
    .line 251
    .line 252
    move-result-wide v16

    .line 253
    goto :goto_6

    .line 254
    :cond_6
    const-wide/16 v16, 0x0

    .line 255
    .line 256
    :goto_6
    move-object/from16 v21, v5

    .line 257
    .line 258
    move-wide/from16 v4, v16

    .line 259
    .line 260
    invoke-virtual {v8, v13}, Lkotlin/text/Regex;->a(Ljava/lang/CharSequence;)Z

    .line 261
    .line 262
    .line 263
    move-result v14

    .line 264
    if-eqz v14, :cond_7

    .line 265
    .line 266
    new-instance v14, Lcom/discord/user_search_worker/UserSearchWorker$Companion$LocalResult;

    .line 267
    .line 268
    move-object/from16 v22, v8

    .line 269
    .line 270
    const-wide/high16 v7, 0x4024000000000000L    # 10.0

    .line 271
    .line 272
    invoke-direct {v0, v7, v8, v4, v5}, Lcom/discord/user_search_worker/UserSearchWorker;->calculateScore(DD)D

    .line 273
    .line 274
    .line 275
    move-result-wide v4

    .line 276
    invoke-direct {v14, v13, v4, v5}, Lcom/discord/user_search_worker/UserSearchWorker$Companion$LocalResult;-><init>(Ljava/lang/String;D)V

    .line 277
    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_7
    move-object/from16 v22, v8

    .line 281
    .line 282
    invoke-virtual {v9, v13}, Lkotlin/text/Regex;->a(Ljava/lang/CharSequence;)Z

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    if-eqz v7, :cond_8

    .line 287
    .line 288
    new-instance v14, Lcom/discord/user_search_worker/UserSearchWorker$Companion$LocalResult;

    .line 289
    .line 290
    const-wide/high16 v7, 0x4014000000000000L    # 5.0

    .line 291
    .line 292
    invoke-direct {v0, v7, v8, v4, v5}, Lcom/discord/user_search_worker/UserSearchWorker;->calculateScore(DD)D

    .line 293
    .line 294
    .line 295
    move-result-wide v4

    .line 296
    invoke-direct {v14, v13, v4, v5}, Lcom/discord/user_search_worker/UserSearchWorker$Companion$LocalResult;-><init>(Ljava/lang/String;D)V

    .line 297
    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_8
    sget-object v7, Lcom/discord/user_search_worker/UserSearchWorker;->Companion:Lcom/discord/user_search_worker/UserSearchWorker$Companion;

    .line 301
    .line 302
    invoke-static {v7, v13}, Lcom/discord/user_search_worker/UserSearchWorker$Companion;->access$strippedOfDiacritics(Lcom/discord/user_search_worker/UserSearchWorker$Companion;Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-direct {v0, v2, v7}, Lcom/discord/user_search_worker/UserSearchWorker;->fuzzySearch(Ljava/lang/String;Ljava/lang/String;)Z

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    if-eqz v7, :cond_9

    .line 311
    .line 312
    new-instance v14, Lcom/discord/user_search_worker/UserSearchWorker$Companion$LocalResult;

    .line 313
    .line 314
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 315
    .line 316
    invoke-direct {v0, v7, v8, v4, v5}, Lcom/discord/user_search_worker/UserSearchWorker;->calculateScore(DD)D

    .line 317
    .line 318
    .line 319
    move-result-wide v4

    .line 320
    invoke-direct {v14, v13, v4, v5}, Lcom/discord/user_search_worker/UserSearchWorker$Companion$LocalResult;-><init>(Ljava/lang/String;D)V

    .line 321
    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_9
    move-object/from16 v14, v20

    .line 325
    .line 326
    :goto_7
    if-eqz v14, :cond_b

    .line 327
    .line 328
    if-eqz v11, :cond_a

    .line 329
    .line 330
    invoke-virtual {v11}, Lcom/discord/user_search_worker/UserSearchWorkerResult;->getScore()D

    .line 331
    .line 332
    .line 333
    move-result-wide v4

    .line 334
    invoke-virtual {v14}, Lcom/discord/user_search_worker/UserSearchWorker$Companion$LocalResult;->getScore()D

    .line 335
    .line 336
    .line 337
    move-result-wide v7

    .line 338
    cmpg-double v4, v4, v7

    .line 339
    .line 340
    if-gez v4, :cond_b

    .line 341
    .line 342
    :cond_a
    new-instance v11, Lcom/discord/user_search_worker/UserSearchWorkerResult;

    .line 343
    .line 344
    invoke-virtual {v14}, Lcom/discord/user_search_worker/UserSearchWorker$Companion$LocalResult;->getComparator()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v16

    .line 348
    invoke-virtual {v14}, Lcom/discord/user_search_worker/UserSearchWorker$Companion$LocalResult;->getScore()D

    .line 349
    .line 350
    .line 351
    move-result-wide v17

    .line 352
    move-object v13, v11

    .line 353
    move-object v14, v12

    .line 354
    move-object/from16 v15, v19

    .line 355
    .line 356
    invoke-direct/range {v13 .. v18}, Lcom/discord/user_search_worker/UserSearchWorkerResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    .line 357
    .line 358
    .line 359
    :cond_b
    move-object/from16 v15, p2

    .line 360
    .line 361
    move-object/from16 v5, v21

    .line 362
    .line 363
    move-object/from16 v8, v22

    .line 364
    .line 365
    const/4 v4, 0x0

    .line 366
    const/4 v7, 0x1

    .line 367
    goto/16 :goto_5

    .line 368
    .line 369
    :cond_c
    move-object/from16 v21, v5

    .line 370
    .line 371
    move-object/from16 v22, v8

    .line 372
    .line 373
    if-eqz v11, :cond_d

    .line 374
    .line 375
    move-object/from16 v4, v21

    .line 376
    .line 377
    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-object v5, v4

    .line 381
    goto :goto_8

    .line 382
    :cond_d
    move-object/from16 v5, v21

    .line 383
    .line 384
    :goto_8
    move-object/from16 v8, v22

    .line 385
    .line 386
    const/4 v4, 0x0

    .line 387
    const/4 v7, 0x1

    .line 388
    goto/16 :goto_2

    .line 389
    .line 390
    :cond_e
    new-instance v1, Llf/q;

    .line 391
    .line 392
    invoke-direct {v1}, Llf/q;-><init>()V

    .line 393
    .line 394
    .line 395
    throw v1

    .line 396
    :cond_f
    move-object v4, v5

    .line 397
    new-array v3, v11, [Lkotlin/jvm/functions/Function1;

    .line 398
    .line 399
    sget-object v5, Lcom/discord/user_search_worker/UserSearchWorker$searchUsers$sortedResults$1;->INSTANCE:Lcom/discord/user_search_worker/UserSearchWorker$searchUsers$sortedResults$1;

    .line 400
    .line 401
    const/4 v6, 0x0

    .line 402
    aput-object v5, v3, v6

    .line 403
    .line 404
    sget-object v5, Lcom/discord/user_search_worker/UserSearchWorker$searchUsers$sortedResults$2;->INSTANCE:Lcom/discord/user_search_worker/UserSearchWorker$searchUsers$sortedResults$2;

    .line 405
    .line 406
    const/4 v6, 0x1

    .line 407
    aput-object v5, v3, v6

    .line 408
    .line 409
    invoke-static {v3}, Lof/a;->b([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-static {v4, v3}, Lkotlin/collections/h;->w0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-virtual/range {p2 .. p2}, Lcom/discord/user_search_worker/UserSearchQuerySetPayload;->getLimit()I

    .line 418
    .line 419
    .line 420
    move-result v4

    .line 421
    invoke-static {v3, v4}, Lkotlin/collections/h;->x0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    iget-object v4, v0, Lcom/discord/user_search_worker/UserSearchWorker;->onResults:Lkotlin/jvm/functions/Function3;

    .line 426
    .line 427
    invoke-interface {v4, v3, v2, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    return-void
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
.end method

.method private final setNewQuery(Lcom/discord/user_search_worker/UserSearchQuerySetData;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchWorker;->queries:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/discord/user_search_worker/UserSearchQuerySetData;->getUuid()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lcom/discord/user_search_worker/UserSearchQuerySetData;->getPayload()Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/discord/user_search_worker/UserSearchQuerySetData;->getUuid()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1}, Lcom/discord/user_search_worker/UserSearchQuerySetData;->getPayload()Lcom/discord/user_search_worker/UserSearchQuerySetPayload;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, v0, p1}, Lcom/discord/user_search_worker/UserSearchWorker;->searchUsers(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V

    .line 23
    .line 24
    .line 25
    return-void
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
.end method


# virtual methods
.method public final getOnResults()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/util/List<",
            "Lcom/discord/user_search_worker/UserSearchWorkerResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchWorker;->onResults:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final onMessage(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "dataJSON"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchWorker;->json:Lkotlinx/serialization/json/Json;

    .line 7
    .line 8
    invoke-interface {v0}, Lwi/e;->a()Lbj/c;

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/discord/user_search_worker/UserSearchData;->Companion:Lcom/discord/user_search_worker/UserSearchData$Companion;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/discord/user_search_worker/UserSearchData$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1, p1}, Lwi/m;->b(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/discord/user_search_worker/UserSearchData;

    .line 22
    .line 23
    instance-of v0, p1, Lcom/discord/user_search_worker/UserSearchUpdateUsersData;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    check-cast p1, Lcom/discord/user_search_worker/UserSearchUpdateUsersData;

    .line 28
    .line 29
    invoke-direct {p0, p1}, Lcom/discord/user_search_worker/UserSearchWorker;->mergeUsers(Lcom/discord/user_search_worker/UserSearchUpdateUsersData;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    instance-of v0, p1, Lcom/discord/user_search_worker/UserSearchQuerySetData;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    check-cast p1, Lcom/discord/user_search_worker/UserSearchQuerySetData;

    .line 38
    .line 39
    invoke-direct {p0, p1}, Lcom/discord/user_search_worker/UserSearchWorker;->setNewQuery(Lcom/discord/user_search_worker/UserSearchQuerySetData;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    instance-of v0, p1, Lcom/discord/user_search_worker/UserSearchQueryClearData;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    check-cast p1, Lcom/discord/user_search_worker/UserSearchQueryClearData;

    .line 48
    .line 49
    invoke-direct {p0, p1}, Lcom/discord/user_search_worker/UserSearchWorker;->clearQuery(Lcom/discord/user_search_worker/UserSearchQueryClearData;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    return-void
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
.end method

.method public final terminate()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchWorker;->users:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchWorker;->queries:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->clear()V

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
