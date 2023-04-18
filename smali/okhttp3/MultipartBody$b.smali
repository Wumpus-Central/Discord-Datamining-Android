.class public final Lokhttp3/MultipartBody$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/MultipartBody;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/MultipartBody$b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B\u001b\u0008\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00088\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\t\u001a\u0004\u0008\u0003\u0010\n\u00a8\u0006\u000f"
    }
    d2 = {
        "Lokhttp3/MultipartBody$b;",
        "",
        "Lokhttp3/Headers;",
        "a",
        "Lokhttp3/Headers;",
        "b",
        "()Lokhttp3/Headers;",
        "headers",
        "Lokhttp3/RequestBody;",
        "Lokhttp3/RequestBody;",
        "()Lokhttp3/RequestBody;",
        "body",
        "<init>",
        "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V",
        "c",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final c:Lokhttp3/MultipartBody$b$a;


# instance fields
.field private final a:Lokhttp3/Headers;

.field private final b:Lokhttp3/RequestBody;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lokhttp3/MultipartBody$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokhttp3/MultipartBody$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lokhttp3/MultipartBody$b;->c:Lokhttp3/MultipartBody$b$a;

    return-void
.end method

.method private constructor <init>(Lokhttp3/Headers;Lokhttp3/RequestBody;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/MultipartBody$b;->a:Lokhttp3/Headers;

    iput-object p2, p0, Lokhttp3/MultipartBody$b;->b:Lokhttp3/RequestBody;

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/Headers;Lokhttp3/RequestBody;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lokhttp3/MultipartBody$b;-><init>(Lokhttp3/Headers;Lokhttp3/RequestBody;)V

    return-void
.end method


# virtual methods
.method public final a()Lokhttp3/RequestBody;
    .locals 1

    iget-object v0, p0, Lokhttp3/MultipartBody$b;->b:Lokhttp3/RequestBody;

    return-object v0
.end method

.method public final b()Lokhttp3/Headers;
    .locals 1

    iget-object v0, p0, Lokhttp3/MultipartBody$b;->a:Lokhttp3/Headers;

    return-object v0
.end method
