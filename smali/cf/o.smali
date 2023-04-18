.class public final synthetic Lcf/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcf/p;


# direct methods
.method public synthetic constructor <init>(Lcf/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcf/o;->k:Lcf/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcf/o;->k:Lcf/p;

    invoke-static {v0}, Lcf/p;->K0(Lcf/p;)V

    return-void
.end method
