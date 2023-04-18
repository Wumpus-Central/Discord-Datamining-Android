.class public interface abstract Lxj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0007\u0008f\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&\u00a8\u0006\u0014"
    }
    d2 = {
        "Lxj/a;",
        "",
        "Ljava/io/File;",
        "file",
        "Lokio/Source;",
        "a",
        "Lokio/Sink;",
        "b",
        "g",
        "",
        "f",
        "",
        "d",
        "",
        "h",
        "from",
        "to",
        "e",
        "directory",
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
.field public static final a:Lxj/a;

.field public static final b:Lxj/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxj/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxj/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxj/a;->b:Lxj/a$a;

    .line 8
    .line 9
    new-instance v0, Lxj/a$a$a;

    .line 10
    .line 11
    invoke-direct {v0}, Lxj/a$a$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lxj/a;->a:Lxj/a;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public abstract a(Ljava/io/File;)Lokio/Source;
.end method

.method public abstract b(Ljava/io/File;)Lokio/Sink;
.end method

.method public abstract c(Ljava/io/File;)V
.end method

.method public abstract d(Ljava/io/File;)Z
.end method

.method public abstract e(Ljava/io/File;Ljava/io/File;)V
.end method

.method public abstract f(Ljava/io/File;)V
.end method

.method public abstract g(Ljava/io/File;)Lokio/Sink;
.end method

.method public abstract h(Ljava/io/File;)J
.end method
