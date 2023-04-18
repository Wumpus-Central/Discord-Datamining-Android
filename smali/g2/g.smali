.class public final synthetic Lg2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lg2/h;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lg2/h;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/g;->a:Lg2/h;

    iput-object p2, p0, Lg2/g;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg2/g;->a:Lg2/h;

    iget-object v1, p0, Lg2/g;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lg2/h;->d(Lg2/h;Ljava/lang/String;)Lg2/k0;

    move-result-object v0

    return-object v0
.end method
