.class public abstract Lcom/discord/user_search_worker/UserSearchData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/user_search_worker/UserSearchData$Companion;,
        Lcom/discord/user_search_worker/UserSearchData$Serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/discord/user_search_worker/UserSearchData;",
        "",
        "()V",
        "Companion",
        "Serializer",
        "Lcom/discord/user_search_worker/UserSearchQueryClearData;",
        "Lcom/discord/user_search_worker/UserSearchQuerySetData;",
        "Lcom/discord/user_search_worker/UserSearchUpdateUsersData;",
        "user_search_worker_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lyi/f;
    with = Lcom/discord/user_search_worker/UserSearchData$Serializer;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/user_search_worker/UserSearchData$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/user_search_worker/UserSearchData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/user_search_worker/UserSearchData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/user_search_worker/UserSearchData;->Companion:Lcom/discord/user_search_worker/UserSearchData$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/user_search_worker/UserSearchData;-><init>()V

    return-void
.end method
