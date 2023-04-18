.class public final synthetic Lcf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcf/b;


# direct methods
.method public synthetic constructor <init>(Lcf/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcf/a;->k:Lcf/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcf/a;->k:Lcf/b;

    invoke-static {v0}, Lcf/b;->K0(Lcf/b;)V

    return-void
.end method
