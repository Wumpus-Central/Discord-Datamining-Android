.class public final synthetic Lg2/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lg2/m0;


# direct methods
.method public synthetic constructor <init>(Lg2/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/l0;->k:Lg2/m0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg2/l0;->k:Lg2/m0;

    invoke-static {v0}, Lg2/m0;->a(Lg2/m0;)V

    return-void
.end method
