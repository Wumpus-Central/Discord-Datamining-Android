.class public interface abstract Lng/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lyf/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lng/g$a;,
        Lng/g$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lng/c;",
        ">;",
        "Lyf/a;"
    }
.end annotation


# static fields
.field public static final f:Lng/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lng/g$a;->a:Lng/g$a;

    sput-object v0, Lng/g;->f:Lng/g$a;

    return-void
.end method


# virtual methods
.method public abstract a(Llh/c;)Lng/c;
.end method

.method public abstract isEmpty()Z
.end method

.method public abstract k(Llh/c;)Z
.end method
